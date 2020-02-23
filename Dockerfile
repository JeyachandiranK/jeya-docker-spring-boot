FROM openjdk:8
ADD target/jeya-docker-spring-boot-0.0.1-SNAPSHOT.jar jeya-docker-spring-boot-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "jeya-docker-spring-boot-0.0.1-SNAPSHOT.jar"]