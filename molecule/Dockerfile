FROM openjdk:17-jdk-alpine

EXPOSE 8002

WORKDIR /app

ADD target/moleculeserver.jar moleculeserver.jar

ENTRYPOINT ["java", "-jar", "moleculeserver.jar"]

