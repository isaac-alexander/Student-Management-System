package com.alex.student_management_system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // Home route
    @GetMapping("/")
    public String viewHomePage() {
        return "index"; // loads index.html
    }
}