# Use OpenJDK 17 base image
FROM openjdk:17

# Copy the built JAR into the image
COPY target/orderservice-0.0.1-SNAPSHOT.jar order-service.jar

# Run the JAR file
ENTRYPOINT ["java", "-jar", "/orderservice.jar"]
