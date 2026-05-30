CREATE DATABASE studentdb;

USE studentdb;
#servlet basic one
CREATE TABLE students(
    id INT PRIMARY KEY,
    name VARCHAR(50),
    marks INT
);

select * from students;


#Student Registration System using:
#HTML + Servlet + JDBC + MySQL



CREATE TABLE student(
    id INT PRIMARY KEY,
    name VARCHAR(50),
    email VARCHAR(50)
);

select * from student;

#Servlet + JSP + JDBC + Session + Cookies
CREATE TABLE users(
    username VARCHAR(50),
    password VARCHAR(50)
);

select * from users;