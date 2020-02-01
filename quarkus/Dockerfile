FROM openjdk:8u222-slim

RUN java -Xshare:dump

COPY target/${project.build.finalName}-runner.jar /app.jar

CMD ["java", "-jar", "/app.jar"]
