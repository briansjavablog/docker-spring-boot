FROM anapsix/docker-oracle-java8

# Creating working directory
WORKDIR /app

# Add src to working directory
ADD target/docker-smaple-2-0.1.0.jar /app/docker-sample-2-0.1.0.jar

# Start app
ENTRYPOINT ["java","-jar","/app/docker-sample-2-0.1.0.jar"]
