package com.techsoft.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/welcome")  // Maps requests to the root path "/"
    public String home() {
        return "Welcome to the Spring Boot App on port 9090!";
    }
}

