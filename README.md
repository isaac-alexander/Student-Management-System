# Student Management System
A simple Student Management System web application built with **Spring Boot**, **Spring MVC**, **Thymeleaf**, **Spring Data JPA (Hibernate)**, and **MySQL**. This application allows you to manage students and teachers, including creating, reading, updating, and deleting records.

---

## Technologies Used
- Java (latest version)
- Spring Boot
- Spring MVC
- Spring Data JPA (Hibernate)
- MySQL
- Thymeleaf
- Bootstrap

## Features
- CRUD operations for Students and Teachers
- List all students and teachers
- Add new student or teacher
- Update student or teacher information
- Delete student or teacher records

## Setup Instructions / ## Cloning from GitHub

you can clone it to your local machine:

- Open a terminal or Git Bash
- Navigate to the folder where you want to clone the project
- Run the clone command (replace <repo-url> with your GitHub repository URL):
- git clone <repo-url>
- Navigate into the cloned folder:
- cd <project-folder-name>
- Open the project in your IDE  IntelliJ
- Configure the database connection in application.properties (see Database Configuration)

## Database Configuration
- Create a database in MySQL (or MySQL Workbench):
  CREATE DATABASE: create database name;
- Configure src/main/resources/application.properties:

# MySQL Configuration
- spring.datasource.url=jdbc:mysql://localhost:3306/"database name"?useSSL=false&serverTimezone=UTC&useLegacyDatetimeCode=false
- spring.datasource.username=root
- spring.datasource.password=YOUR_PASSWORD

# Hibernate Configuration
- spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
- spring.jpa.hibernate.ddl-auto=update
- logging.level.org.hibernate.SQL=DEBUG


- Run the project

`http://localhost:8080/`
- Home page
- Manage Students route `http://localhost:8080/students`

- Manage Teachers `http://localhost:8080/teachers`
