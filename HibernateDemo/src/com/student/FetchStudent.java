package com.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchStudent {

    public static void main(String[] args) {

        Configuration cfg =
                new Configuration();

        cfg.configure(
                "hibernate.cfg.xml");

        SessionFactory factory =
                cfg.buildSessionFactory();

        Session session =
                factory.openSession();

        Student s =
                session.get(Student.class, 101);

        System.out.println(
                "ID: " + s.getId());

        System.out.println(
                "Name: " + s.getName());

        System.out.println(
                "Email: " + s.getEmail());

        session.close();

        factory.close();
    }
}