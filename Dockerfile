FROM openjdk:11-jre-slim
WORKDIR /app
COPY ./target/ipgetter-0.0.1-SNAPSHOT.jar /app/ipgetter-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["java", "-jar", "ipgetter-0.0.1-SNAPSHOT.jar"]