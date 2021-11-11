package com.example.SpringBootNtt.service;

import com.example.SpringBootNtt.entity.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student){
        students.add(student);
    }

    public Student getStudent(String studentName){
        for (Student s: students) {
            if (studentName.equals(s.getName())){
                return s;
            }
        }

        return new Student("Usuario no encontrado");
    }

    public List<Student> getLista() {
        return students;
    }
}
