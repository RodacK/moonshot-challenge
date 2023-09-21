FROM quay.io/wildfly/wildfly
ADD ./calculator-ws/target/calculator-ws.war /opt/jboss/wildfly/standalone/deployments/
EXPOSE 8080