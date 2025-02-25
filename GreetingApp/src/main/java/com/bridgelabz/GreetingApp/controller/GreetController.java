package com.bridgelabz.GreetingApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class GreetController {

    //get the hello world string
    @GetMapping("/hello")
    public String getGreeting() {
        return "Hello World";
    }


}
