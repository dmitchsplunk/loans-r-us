FROM eclipse-temurin:17-jdk AS builder

WORKDIR /src

COPY ./gradlew* ./settings.gradle* ./build.gradle .
COPY ./gradle ./gradle

CMD ["./gradlew", "build"]
COPY ./ ./

# -----------------------------------------------------------------------------

FROM eclipse-temurin:17-jre

WORKDIR /app

COPY --from=builder /src/build/libs/*SNAPSHOT.jar loanservice.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "./loanservice.jar"]