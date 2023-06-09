FROM amazoncorretto:17-alpine3.17

COPY --chown=185 target/kaushal-0.0.1-SNAPSHOT.jar /deployments/kaushal-0.0.1-SNAPSHOT.jar

EXPOSE 8080

CMD ["java","-jar","/deployments/kaushal-0.0.1-SNAPSHOT.jar"]