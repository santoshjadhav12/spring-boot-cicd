package com.techsoft.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/san")
    public String getMessage(){
        return "Welcome to tech soft";
        
    }

}
