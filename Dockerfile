FROM openjdk:11-jre as was
ARG JAR_FILE_PATH=./build/libs/EZPT-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE_PATH} app.jar
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=dev", "app.jar" ]