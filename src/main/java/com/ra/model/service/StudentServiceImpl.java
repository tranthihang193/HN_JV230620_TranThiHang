package com.ra.model.service;

import com.ra.model.dao.StudentDAO;
import com.ra.model.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentDAO studentDAO;
    @Override
    public List<Student> getAll() {
        return studentDAO.getAll();
    }
}
