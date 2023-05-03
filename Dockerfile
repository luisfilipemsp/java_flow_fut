FROM maven:3.5.0-jdk-8-alpine as builder
FROM openjdk:8-jre-alpine 

WORKDIR /app

COPY . .
COPY --from=builder /app /app
RUN javac LeerInfo.java 

CMD ["java", "LeerInfo"]
