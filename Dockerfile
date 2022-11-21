FROM openjdk:11
EXPOSE 8080
ADD target/spring-boot-FOREX-SERVICE.jar spring-boot-FOREX-SERVICE.jar
ENTRYPOINT ["java","-jar","/spring-boot-FOREX-SERVICE.jar"]