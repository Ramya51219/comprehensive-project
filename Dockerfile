FROM openjdk:11
EXPOSE 8080
ADD target/comprehensive-docker.jar comprehensive-docker.jar
ENTRYPOINT ["java","-jar","/comprehensive-docker.jar"]

