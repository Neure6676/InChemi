FROM openjdk:17-jdk-alpine

EXPOSE 8070

WORKDIR /app

ADD target/eurekaserver.jar eurekaserver.jar

ENTRYPOINT ["java", "-jar", "eurekaserver.jar"]

