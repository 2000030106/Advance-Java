package com.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteStudent {

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
                session.get(Student.class, 101);

        session.delete(s);

        tx.commit();

        System.out.println(
                "Deleted Successfully");

        session.close();

        factory.close();
    }
}