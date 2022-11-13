# Build the application first using Maven
FROM maven:3.8-openjdk-11 as build
RUN mkdir /googleconfig
ADD fair-sandbox-366108-3504f717426d.json /app/fair-sandbox-366108-3504f717426d.json
COPY fair-sandbox-366108-3504f717426d.json /googleconfig/fair-sandbox-366108-3504f717426d.json
COPY fair-sandbox-366108-3504f717426d.json /app/fair-sandbox-366108-3504f717426d.json
WORKDIR /app
COPY . .
RUN mvn install

# Inject the JAR file into a new container to keep the file small
FROM openjdk:11-jre-slim
WORKDIR /app
COPY --from=build /app/target/brandoo-application-0.0.1-SNAPSHOT.jar /app/app.jar
COPY --from=build /app/fair-sandbox-366108-3504f717426d.json /app/googleconfig/fair-sandbox-366108-3504f717426d.json
RUN chmod 777 /app/googleconfig/fair-sandbox-366108-3504f717426d.json
EXPOSE 8080
ENTRYPOINT ["sh", "-c"]
CMD ["java -jar app.jar"]
