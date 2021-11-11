package com.example.SpringBootNtt.controller;

import com.example.SpringBootNtt.entity.Student;
import com.example.SpringBootNtt.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/{nombre}")
    public String helloWorld(@PathVariable String name){
        return "Hello World! by " + name;
    }

    @PostMapping
    public void addStudent(@RequestBody Student student){
        service.addStudent(student);
    }

    @GetMapping("/pornombre/{nombreVariable}")
    public Student getStudentByName(@PathVariable("nombreVariable") String name){
        return service.getStudent(name);
    }

}
