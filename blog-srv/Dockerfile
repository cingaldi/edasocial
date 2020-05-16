FROM maven:3.6.2-jdk-11-slim AS builder
WORKDIR /usr/src/app

COPY pom.xml .
COPY src/ ./src/

RUN mvn clean install -q -DskipTests=true

FROM alpine:edge AS runtime
WORKDIR /usr/local/app
RUN apk add --no-cache openjdk11
COPY --from=builder /usr/src/app/target/blog-srv-1.0.jar ./blog-srv-1.0.jar.jar
CMD /usr/bin/java -jar ./blog-srv-1.0.jar.jar