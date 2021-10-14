FROM openjdk:8-jre-alpine3.9
EXPOSE 8080
WORKDIR .
COPY . .
CMD ["java", "-jar","./target/soleproprietorship-0.0.1-SNAPSHOT.jar"]