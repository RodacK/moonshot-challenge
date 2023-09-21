#!/bin/bash
echo "################# configuring oracle ##################"
#docker pull gvenzl/oracle-free
#docker run --name moonshot -d -p 1521:1521 -e ORACLE_PASSWORD=1234 gvenzl/oracle-free
echo "################# esperanod que se ocnfigure oracle ##################"
#sleep 90
#docker exec moonshot createAppUser rob 1234 FREEPDB1
echo "################# compilando el war del servicio soap ##################"
cd calculator-ws
#mvn compile war:war
echo "################# configurando server para calculus ##################"
#docker build --tag=calculus .
#docker run --name calculus -d calculus
echo "################# bootjar para nuetro project ##################"
cd ../rob
./gradlew bootjar
echo "################# configurando server para nuestro project ##################"
docker build --tag=rob .
docker run --net=host --name rob -d rob


