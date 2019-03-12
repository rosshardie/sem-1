FROM openjdk:latest
ENV MYSQL_ROOT_PASSWORD mysql
COPY ./target/seMethods-0.1.0.8.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "seMethods-0.1.0.8.jar", "db:3306"]
