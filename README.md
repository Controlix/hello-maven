### How to run?

You have to set the url for the feign client for maven with this property
`spring.cloud.openfeign.client.config.maven.url`

#### IntelliJ
To run the application from IntelliJ, add the following environment variable to the run configuration:
> spring.cloud.openfeign.client.config.maven.url=https://search.maven.org/

#### java command line
To build an executable jar file, run
> mvn clean install

Then start the application with java
> java -jar target/hello-maven-0.0.1-SNAPSHOT.jar

#### docker
To create a native docker image, run
>mvn -Pnative spring-boot:build-image

Then start the application with docker
> docker run --rm -p 8080:8080 -e spring.cloud.openfeign.client.config.maven.url=https://search.maven.org/ hello-maven:0.0.1-SNAPSHOT