package com.ra.controller;

import com.ra.model.entity.Student;
import com.ra.model.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("/student")
    public String index(Model model){
        List<Student> students = studentService.getAll();
        model.addAttribute("students",students);
        return "student/index";
    }
}
