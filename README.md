1. Steps to Run the Code
2.Import the Project
3.Setup the Database
spring.datasource.url=jdbc:mysql://localhost:3307/nimapassign
spring.datasource.username=root
spring.datasource.password=Pass1234
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true


4.Build the Project:

5.Access APIs:
http://localhost:8080

##Database Design##
Category Table
CREATE TABLE category (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);
Product Table:
CREATE TABLE product (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    price DECIMAL(10, 2) NOT NULL,
    category_id BIGINT NOT NULL,
    FOREIGN KEY (category_id) REFERENCES category(id)
);


##How to Run the Machine Test

1.Start the Spring Boot application
2.Use tool  Postman
3.Check the database tables for inserted/updated/deleted records using any SQL client
4.Use the page parameter in API requests to test server-side pagination



