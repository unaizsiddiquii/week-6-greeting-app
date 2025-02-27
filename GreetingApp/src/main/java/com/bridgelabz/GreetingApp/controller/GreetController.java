package com.bridgelabz.GreetingApp.controller;

import com.bridgelabz.GreetingApp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetController {
//
//    //Use Case 1
//    @GetMapping("")
//    public String greeting() {
//        return "Hello World";
//    }
//
//    @GetMapping("/hello")
//    public String getHelloGreeting(@RequestParam(value = "name", defaultValue = "world") String name) {
//        User user = new User();
//        user.setMessage("Hello");
//        user.setFirstName(name);
//        return user.getMessage() + " " + user.getFirstName();
//    }
//
//    @PostMapping("/post")
//    public User getGreeting(@RequestBody User user) {
//        return user;
//    }
//
//    @PutMapping("/put")
//    public User putGreeting(@RequestBody User user) {
//        return user;
//    }
//

    //    UseCase 2

    private final GreetingService greetingService;

    @Autowired
    public GreetController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/hello")
    public String getGreeting() {
        return greetingService.getGreetMessage();
    }


}
