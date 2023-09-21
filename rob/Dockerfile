FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY build/libs/rob-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8081