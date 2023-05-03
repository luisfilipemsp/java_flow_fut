FROM maven:3.5.0-jdk-8-alpine 
FROM openjdk:8-jre-alpine 

WORKDIR /app

COPY . .

RUN javac ./LeerInfo.java 

CMD ["java", "LeerInfo"]
