FROM amazoncorretto:11-alpine-jdk
COPY target/JCP-0.0.1-SNAPSHOT.jar  jcp-app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","jcp-app.jar"]