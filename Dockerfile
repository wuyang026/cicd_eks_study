FROM eclipse-temurin:21-jdk-alpine
COPY app/api/build/libs/app.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
