FROM eclipse-temurin:17-jdk-alpine as builder

ARG JAR_FILE
ADD ${JAR_FILE} /app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]