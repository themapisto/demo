FROM openjdk:8-jdk-alpine
CMD ["./mvnw", "clean", "package"]
ARG JAR_FILE=target/*.jar
COPY ./target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
