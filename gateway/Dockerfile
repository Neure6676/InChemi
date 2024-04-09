FROM openjdk:17-jdk-alpine

EXPOSE 8072

WORKDIR /app

ADD target/gatewayserver.jar gatewayserver.jar

ENTRYPOINT ["java", "-jar", "gatewayserver.jar"]

