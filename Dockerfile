FROM maven:3.5-jdk-8-alpine

# Copy local code to the container image.
WORKDIR /app
COPY pom.xml .
COPY src ./src
# COPY user-center-0.0.1-SNAPSHOT.jar ./user-center-0.0.1-SNAPSHOT.jar

# Build a release artifact.
RUN mvn package -DskipTests

# Run the web service on container startup.
CMD ["java","-jar","/app/target/user-center-0.0.1-SNAPSHOT.jar"]
#CMD ["java","-jar","/app/target/user-center-backend-0.0.1-SNAPSHOT.jar","--spring.profiles.active=prod"]