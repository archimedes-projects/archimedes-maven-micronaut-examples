# Micronaut Maven Kotlin parent - Example

This project try to be a simple but complete example of use of 
[micronaut-kotlin-parent](https://github.com/archimedes-projects/archimedes-maven-micronaut/tree/main/micronaut-kotlin-parent).

In this example you can find:

 - Code written in **Kotlin**.
 - Maven multi-module project, that separates domain and REST API.
 - Integration with Micronaut Data JDBC (no ORM), and use of `@Transaction`.
 - Use dockerized PostgreSQL to run integration tests.
 - Ability to run application from Maven command line `mvn -pl rest mn:run` (thanks to Micronaut Maven plugin).
 - Ability to dockerize the application (thanks to Micronaut Maven plugin)
 
To build (compile, test, package, integration tests...) the complete project you can run in the root project directory:
 
 ```bash
mvn clean install
```

Please check the source code, specially the diverse `pom.xml` files, to see how all things are easily configured.
