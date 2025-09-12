FROM openjdk:17-alpine
EXPOSE 8080
ADD target/spring-boot-docker.jar spring-boot-docker.jar
ENTRYPOINT["Java","-jar","/spring-boot-docker.jar"]