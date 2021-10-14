FROM openjdk:8-jre-alpine3.9
EXPOSE 8080
WORKDIR .
COPY . .
CMD ["java", "-jar","./soleproprietorship-0.0.1-SNAPSHOT.jar"]