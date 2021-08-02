# Hexagonal Architecture example with Spring Boot

The goal of this project is to implement the hexagonal architecture (Port & Adapter) with spring boot

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.5.3/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.5.3/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.5.3/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.5.3/reference/htmlsingle/#boot-features-jpa-and-spring-data)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/2.5.3/reference/htmlsingle/#production-ready)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)



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
