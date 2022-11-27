#Packaging of application

FROM openjdk:12
ADD target/spring-mysql-docker.jar spring-mysql-docker.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","spring-mysql-docker.jar"]