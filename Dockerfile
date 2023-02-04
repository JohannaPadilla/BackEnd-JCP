FROM amazoncorretto:8-alpine-jdk
COPY target/JCP-0.0.1-SNAPSHOT.jar  jcpapp.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","jcpapp.jar"]