package com.bridgelabz.GreetingApp.service;

import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class GreetingService {

    public String getGreetMessage() {
        return "Hello World";
    }

    public String getGreetMessage(String firstName, String lastName) {
        String greetMessage = "Hello ";
        if (firstName != null && lastName != null) {
            return greetMessage + firstName + " " + lastName;
        } else
            return greetMessage + Objects.requireNonNullElseGet(firstName, () -> Objects.requireNonNullElse(lastName, "World"));

    }
}
