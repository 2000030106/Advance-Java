//setter injection


//<!-- 
//<?xml version="1.0" encoding="UTF-8"?>
//
//<beans xmlns=
//"http://www.springframework.org/schema/beans"
//
//xmlns:xsi=
//"http://www.w3.org/2001/XMLSchema-instance"
//
//xsi:schemaLocation=
//"http://www.springframework.org/schema/beans
//http://www.springframework.org/schema/beans/spring-beans.xsd">
//
//<bean id="student"
//class="com.spring.Student">
//
//<property name="id"
//value="101"/>
//
//<property name="name"
//value="Mahender"/>
//
//</bean>
//
//</beans>
//-->


//package com.spring;
//
//public class Student {
//
//    private int id;
//
//    private String name;
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void display() {
//
//        System.out.println(
//                "ID: " + id);
//
//        System.out.println(
//                "Name: " + name);
//    }
//}

//Constructor injection

package com.spring;

public class Student {

    private int id;

    private String name;

    public Student(int id,
                   String name) {

        this.id = id;
        this.name = name;
    }

    public void display() {

        System.out.println(
                "ID: " + id);

        System.out.println(
                "Name: " + name);
    }
}