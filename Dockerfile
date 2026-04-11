FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

COPY target/employee-performance-system-1.0.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]