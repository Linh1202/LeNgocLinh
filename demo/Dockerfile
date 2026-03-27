# Sử dụng JDK 17 lightweight
FROM openjdk:17-jdk-alpine

# Thư mục làm việc trong container
WORKDIR /app

# Copy tệp jar từ thư mục target được Maven build
COPY target/*.jar app.jar

# Chạy ứng dụng Spring Boot
ENTRYPOINT ["java", "-jar", "app.jar"]
