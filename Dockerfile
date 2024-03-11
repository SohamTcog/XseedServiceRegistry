FROM openjdk:17
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} xseed-service-registry.jar
ENTRYPOINT ["java","-jar","/xseed-service-registry.jar"]
EXPOSE 8761