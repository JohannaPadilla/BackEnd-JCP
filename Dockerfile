FROM amazoncorretto:11-alpine-jdk
MAINTAINER JCP
COPY target/JCP-0.0.1-SNAPSHOT.jar  jcp-app.jar
ENTRYPOINT ["java","-jar","/jcp-app.jar"]