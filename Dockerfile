FROM openjdk:8-alpine

COPY target/uberjar/probandoluminus.jar /probandoluminus/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/probandoluminus/app.jar"]
