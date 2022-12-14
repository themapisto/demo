FROM openjdk:8-jdk-alpine
CMD ["sudo","./mvnw", "clean", "package"]
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
