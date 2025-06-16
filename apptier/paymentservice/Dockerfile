# Use OpenJDK 17 base image
FROM openjdk:17

# Copy the built JAR into the image
COPY target/paymentservice-0.0.1-SNAPSHOT.jar paymentservice.jar

# Run the JAR file
ENTRYPOINT ["java", "-jar", "/paymentservice.jar"]
