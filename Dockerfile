FROM maven:3.3-jdk-8-onbuild
FROM java:8
ENV MYSQL_ROOT_PASSWORD mysql
COPY --from=0 /usr/src/app/target/seMethods-0.1.0.1-jar-with-dependencies.jar /opt/demo.jar
CMD ["java","-jar","/opt/demo.jar"]
