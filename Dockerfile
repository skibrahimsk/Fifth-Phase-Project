FROM openjdk:8
EXPOSE 8097
ADD target/JenkinsDeploy-0.0.1-SNAPSHOT.jar JenkinsDeploy-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/JenkinsDeploy-0.0.1-SNAPSHOT.jar"]