FROM adoptopenjdk/openjdk11:alpine-jre
MAINTAINER byhi

ARG JAR_FILE=build/libs/gym-app-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} gym-app-0.0.1.jar
EXPOSE 9001 8080
ENTRYPOINT ["java","-jar","/gym-app-0.0.1.jar"]