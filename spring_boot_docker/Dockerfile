#Download the source you need to run the application
FROM openjdk:12

#Expose the port your application is running on
EXPOSE 8080

#Add the jar of the spring boot docker
ADD target/spring-boot-docker.jar spring-boot-docker.jar

#The command to execute first as soon as the image is executed
ENTRYPOINT ["java","-jar","spring-boot-docker.jar"]