package com.ra.model.dao;

import com.ra.model.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO{
    @Autowired
    SessionFactory sessionFactory;
    @Override
    public List<Student> getAll() {
        List<Student> students = new ArrayList<>();
        try (Session session = sessionFactory.openSession()) {
            students = session.createQuery("from Student ", Student.class).list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }
}
