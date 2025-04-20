FROM openjdk:17
COPY target/Demo-Docker.jar  /usr/app/
WORKDIR /usr/app/
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "Demo-Docker.jar"]
