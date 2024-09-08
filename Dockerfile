FROM openjdk:17-alpine

# Set the working directory to /app
WORKDIR /app

# Copy the current directory contents into the container at /app
COPY target/book-details-maven.jar /app

# Expose the port the application will run on
EXPOSE 8080

# Run the command to start the application when the container launches
CMD ["java", "-jar", "book-details-maven.jar"]