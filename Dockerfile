FROM openjdk:17
RUN mkdir arunfolder && cd arunfolder
ADD https://github.com/Rajaram-Arun32/Docker.git  .
WORKDIR arunfolder
EXPOSE 8080
ENTRYPOINT ["java","-jar","spring-boot-docker.jar"]

