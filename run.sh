#!/bin/bash
function ProgressBar {
  # Author : Teddy Skarin
	let _progress=(${1}*100/${2}*100)/100
	let _done=(${_progress}*4)/10
	let _left=40-$_done
	_done=$(printf "%${_done}s")
	_left=$(printf "%${_left}s")
printf "\rProgress : [${_done// /#}${_left// /-}] ${_progress}%%"
}

echo "################# configuring oracle ##################"
docker pull gvenzl/oracle-free
docker run --name moonshot -d -p 1521:1521 -e ORACLE_PASSWORD=1234 gvenzl/oracle-free
echo "################# waiting for oracle to set up ##################"
# Variables
_start=1

# This accounts as the "totalState" variable for the ProgressBar function
_end=100

# Proof of concept
for number in $(seq ${_start} ${_end})
do
	sleep 0.5
	ProgressBar ${number} ${_end}
done
#sleep 90
docker exec moonshot createAppUser rob 1234 FREEPDB1
echo "################# compiling the soap service .war ##################"
cd calculator-ws
mvn package
echo "################# configuring server for soap service ##################"
docker build --tag=calculus .
docker run --name calculus -d -p 8080:8080 calculus
echo "################# bootjar for our project ##################"
cd ../rob
./gradlew bootjar
echo "################# configuring server for our project ##################"
docker build --tag=rob .
docker run --net=host --name rob -d rob


