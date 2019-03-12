FROM openjdk:latest
ENV MYSQL_ROOT_PASSWORD mysql
COPY ./target/seMethods.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "seMethods.jar", "db:3306"]
