FROM openjdk:11
ADD target/first-app.jar app.jar
EXPOSE 9292
ENTRYPOINT [ "java", "-jar", "app.jar" ]