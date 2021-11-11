package com.example.SpringBootNtt.controller;

import com.example.SpringBootNtt.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @Autowired
    private StudentService service;

    @GetMapping("/home")
    public String homePage(Model model){
        model.addAttribute("yoSoy", "Marcos");
        return "home";
    }

    @GetMapping("/studentsList")
    public String studentsList(Model model){
        model.addAttribute("students", service.getLista());
        return "student";
    }
}
