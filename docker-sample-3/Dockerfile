FROM anapsix/docker-oracle-java8

# Creating working directory
WORKDIR /app

# Pull artifact from repo and add to working directory
ADD https://s3-us-west-2.amazonaws.com/docker-boot-artifact/docker-spring-boot-0.1.0.jar /app/docker-sample-3-0.1.0.jar

# Start app
ENTRYPOINT ["java","-jar","/app/docker-spring-sample-3-0.1.0.jar"]
