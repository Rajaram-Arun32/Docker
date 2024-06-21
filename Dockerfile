FROM openjdk:17
RUN apt install git -y && git clone https://github.com/Rajaram-Arun32/Docker.git
COPY /target/spring-boot-docker.jar spring-boot-docker.jar
EXPOSE 8080
ENTRYPOINT [ "java", "jar", "spring-boot-docker.jar" ]