# Hexagonal Architecture example with Spring Boot

The goal of this project is to implement the hexagonal architecture (Port & Adapter) with spring boot


# Technologies used :
    Spring Boot 2.5.3
    Spring 5.3.9
    Tomcat 
    Maven 3
    Java 11
    H2
    JPA
    
# Run the application :

To run the Application, you need to have [JDK](http://www.oracle.com/technetwork/java/javase/downloads/index.html), [Maven](https://maven.apache.org/) 

```
Clone the project, go to springboot-hexagonal-architecture-example diractory

cd springboot-hexagonal-architecture-example
mvn clean install
mvn spring-boot:run
```

- To get all employees : http://localhost:8082/employees/view/
- To get employee 1 : http://localhost:8082/employees/view/1
- To create a new emplyee, use the URL http://localhost:8082/employees/create with a payload like this
```
{
    "name": "Houda",
    "role": "User",
    "salary": 1400
}
```

You can also use swagger-ui
http://localhost:8082/swagger-ui.html#/ 
