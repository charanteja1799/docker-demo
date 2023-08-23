FROM eclipse-temurin:17

# Set the working directory inside the container
WORKDIR /app

# Copy the packaged JAR file into the container at the working directory
COPY target/spring-docker-demo-0.0.1-SNAPSHOT.jar app.jar
# Expose the port that your Spring Boot app will run on
EXPOSE 8080
# Specify the command to run your application
CMD ["java", "-jar", "app.jar"]
