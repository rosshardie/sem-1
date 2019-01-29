FROM mysql
WORKDIR /tmp
COPY ./target/seMethods-0.1.0.1-jar-with-dependencies.jar /tmp
ENV MYSQL_ROOT_PASSWORD mysql