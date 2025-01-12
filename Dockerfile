FROM eclipse-temurin:21.0.5_11-jdk-ubi9-minimal
WORKDIR /cont
COPY ./pom.xml /cont
ADD ./target/*.jar /eureka.jar
COPY ./src /cont/src
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "/eureka.jar"]