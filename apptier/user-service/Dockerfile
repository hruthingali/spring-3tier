FROM openjdk:17-jdk-slim

WORKDIR /app

# Copy the JAR file into the image
COPY target/user-service-0.0.1-SNAPSHOT.jar app.jar

# Run the JAR
ENTRYPOINT ["java", "-jar", "app.jar"]
