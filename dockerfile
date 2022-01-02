FROM maven:3.6.3-jdk-11 as builder
WORKDIR /usr/home/app
COPY pom.xml .
RUN mvn -e -B dependency:resolve
COPY src ./src
RUN mvn -e -B package

FROM gcr.io/distroless/java:11-nonroot
COPY --from=builder /usr/home/app/target/*.jar app.jar
EXPOSE 8080
CMD ["app.jar"]