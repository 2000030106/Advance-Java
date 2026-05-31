package com.college;

import java.util.*;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class InsertData {

    public static void main(String[] args) {

        Configuration cfg =
                new Configuration();

        cfg.configure(
                "hibernate.cfg.xml");

        SessionFactory sf =
                cfg.buildSessionFactory();

        Session session =
                sf.openSession();

        Transaction tx =
                session.beginTransaction();

        Laptop l =
                new Laptop();

        l.setLid(1);
        l.setBrand("Dell");

        Course c1 =
                new Course();

        c1.setCid(101);
        c1.setCname("Java");

        Course c2 =
                new Course();

        c2.setCid(102);
        c2.setCname("Python");

        Student s =
                new Student();

        s.setId(1);
        s.setName("Mahender");

        s.setLaptop(l);

        List<Course> courseList =
                new ArrayList<Course>();

        courseList.add(c1);
        courseList.add(c2);

        s.setCourses(courseList);

        Department d =
                new Department();

        d.setDid(10);
        d.setDname("CSE");

        List<Student> stuList =
                new ArrayList<Student>();

        stuList.add(s);

        d.setStudents(stuList);

        session.save(l);
        session.save(c1);
        session.save(c2);
        session.save(s);
        session.save(d);

        tx.commit();

        System.out.println(
                "Data Inserted Successfully");

        session.close();

        sf.close();
    }
}