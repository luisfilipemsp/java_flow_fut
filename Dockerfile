FROM openjdk:8

WORKDIR /app

COPY . .
RUN javac /app/LeerInfo.java 

CMD ["java", "LeerInfo"]
