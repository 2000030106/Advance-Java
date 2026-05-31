package com.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertStudent {

    public static void main(String[] args) {

        Configuration cfg =
                new Configuration();

        cfg.configure(
                "hibernate.cfg.xml");

        SessionFactory factory =
                cfg.buildSessionFactory();

        Session session =
                factory.openSession();

        Transaction tx =
                session.beginTransaction();

        Student s =
                new Student();

        s.setId(101);
        s.setName("Mahender");
        s.setEmail("mahender@gmail.com");

        session.save(s);

        tx.commit();

        System.out.println(
                "Inserted Successfully");

        session.close();

        factory.close();
    }
}