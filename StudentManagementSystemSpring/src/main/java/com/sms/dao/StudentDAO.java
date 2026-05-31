package com.sms.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sms.model.Student;

public class StudentDAO {

    Configuration cfg =
            new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(Student.class);

    SessionFactory sf =
            cfg.buildSessionFactory();

    public void saveStudent(Student s) {

        Session session =
                sf.openSession();

        Transaction tx =
                session.beginTransaction();

        session.save(s);

        tx.commit();

        session.close();
    }

    public List<Student> getAllStudents() {

        Session session =
                sf.openSession();

        List<Student> list =
                session.createQuery(
                        "from Student")
                        .list();

        session.close();

        return list;
    }

    public Student getStudent(int id) {

        Session session =
                sf.openSession();

        Student s =
                session.get(Student.class, id);

        session.close();

        return s;
    }

    public void updateStudent(Student s) {

        Session session =
                sf.openSession();

        Transaction tx =
                session.beginTransaction();

        session.update(s);

        tx.commit();

        session.close();
    }

    public void deleteStudent(int id) {

        Session session =
                sf.openSession();

        Transaction tx =
                session.beginTransaction();

        Student s =
                session.get(Student.class, id);

        session.delete(s);

        tx.commit();

        session.close();
    }
}