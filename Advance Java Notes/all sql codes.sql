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

INSERT INTO users VALUES('admin','1234');


#Hibernate
CREATE DATABASE hibernatedb;

USE hibernatedb;

CREATE TABLE student(
    id INT PRIMARY KEY,
    name VARCHAR(50),
    email VARCHAR(50)
);

select * from student;


create database collegedb;

use collegedb;

show tables;

select * from student;

select * from laptop;

select * from course;

select * from department;

select * from student_course;

select * from department_student;


#spring 

create database smsdb;

use smsdb;

select * from student;

#spring boot rest api

create database studentrestdb;

use studentrestdb;

show tables;

select * from student;

#spring boot crud

create database studentcrud;
use studentcrud;

show tables;

select * from student;


#spring boot basic front end,validation,exception

create database validationdb;
use validationdb;

show tables;

select * from student;


# spring boot major project 

create database emsdb;

use emsdb;

show tables;

select * from employee;
select * from users;