FROM openjdk:8-jdk-alpine
COPY . .
WORKDIR .
VOLUME /tmp
EXPOSE 8010
ADD target/*.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar"]