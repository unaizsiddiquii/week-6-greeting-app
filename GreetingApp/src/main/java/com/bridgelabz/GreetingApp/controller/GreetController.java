package com.bridgelabz.GreetingApp.controller;

import com.bridgelabz.GreetingApp.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetController {

    //Use Case 1
    @GetMapping("")
    public String greeting() {
        return "Hello World";
    }

    @GetMapping("/hello")
    public String getHelloGreeting(@RequestParam(value = "name", defaultValue = "world") String name) {
        User user = new User();
        user.setMessage("Hello");
        user.setFirstName(name);
        return user.getMessage() + " " + user.getFirstName();
    }

    @PostMapping("/post")
    public User getGreeting(@RequestBody User user) {
        return user;
    }

    @PutMapping("/put")
    public User putGreeting(@RequestBody User user) {
        return user;
    }


}
