FROM amazoncorretto:17-al2-jdk

ARG APP_VERSION=NONE
ARG JAR_FILE=build/libs/*.jar
ARG PROFILE=local

LABEL name ="GeunChang Ahn"
LABEL email = "gcahn79@w-mall.co.kr"
LABEL version = "${APP_VERSION}"
LABEL description = "${APP_VERSION} upgrade"

COPY ${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar","--spring.profiles.active=${PROFILE}"]