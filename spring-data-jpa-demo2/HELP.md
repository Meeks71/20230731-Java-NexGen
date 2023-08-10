# Getting Started

### Thursday JPA demo Notes

#### Circular Reference Fixes

Setup:

Movie has one director

Director has many Movies

When using a bidirectional relationship, both classes have a reference to the other class.

Issue: This creates a circular reference.

#### Solution 1: Use @JsonBackReference annotation on one side to prevent serialization

```java
@Entity 
class Director {
    @OneToMany(mappedBy = "director")
    @JsonBackReference // prevents JSON infinite recursion by not serializing this field
    Set<Movie> movies;
}

@Entity
class Movie {
   @ManyToOne
   @JoinColumn(name = "director_id")
   Director director;
}
```

#### Solution 2: Use @JsonIdentityInfo and @JsonIdentityReference
```java
@Entity 
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
class Director {
    @OneToMany(mappedBy = "director")
    Set<Movie> movies;
}

@Entity
class Movie {
   @ManyToOne
   @JoinColumn(name = "director_id")
   @JsonIdentityReference(alwaysAsId = true) // JSON serialization just uses the id instead of a nested object
   Director director;
}
```

#### Solution 3: Using a DTO
DTO = Data Transfer Object



### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.14/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.14/maven-plugin/reference/html/#build-image)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.7.14/reference/htmlsinge/index.html#data.sql.jpa-and-spring-data)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.7.14/reference/htmlsinge/index.html#web)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

