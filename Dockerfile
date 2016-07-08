FROM anapsix/docker-oracle-java8

# Install maven
RUN apt-get update -y
RUN apt-get install -y maven

# Creating working directory
WORKDIR /app

# Add src to working directory
ADD pom.xml /app/pom.xml
ADD src /app/src

# Build JAR
RUN mvn package -DskipTests=true

RUN ls /app/target

# Start app
ENTRYPOINT ["java","-jar","/app/target/docker-spring-boot-0.1.0.jar"]
