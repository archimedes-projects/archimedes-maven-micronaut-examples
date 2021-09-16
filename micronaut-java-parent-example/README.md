# Micronaut Maven Java parent - Example

This project try to be a simple but complete example of use of [micronaut-java-parent](https://github.com/archimedes-projects/archimedes-maven-micronaut/tree/main/micronaut-java-parent).

In this example you can find:

 - Code written in **Java**.
 - Maven multi-module project, that separates domain and REST API.
 - Use of [Lombok](https://projectlombok.org) annotations.
 - Integration with Spring transaction manager and JdbcTemplate, and use of `@Transaction`.
 - Use dockerized PostgreSQL to run integration tests.
 - Ability to run application from Maven command line (`mvn -pl rest exec:exec`).
 - Ability to dockerize the application with [Jib](https://github.com/GoogleContainerTools/jib) (`mvn -pl rest jib:dockerBuild`)
 
 To build (compile, test, package, integration tests...) the complete project you can run in the root project directory:
 
 ```bash
mvn clean install
```
 
 Please check the source code, specially the different `pom.xml`, to see how all things are easily configured.
