package com.bridgelabz.GreetingApp.service;

import com.bridgelabz.GreetingApp.Repository.GreetingRepository;
import com.bridgelabz.GreetingApp.model.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingService {
    private final GreetingRepository greetingRepository;

    @Autowired
    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public String getGreetMessage() {
        return "Hello World";
    }

    public String getGreetMessage(String firstName, String lastName) {
        String greetMessage;
        if (firstName != null && lastName != null) {
            greetMessage = "Hello " + firstName + " " + lastName;
        } else if (firstName != null) {
            greetMessage = "Hello " + firstName;
        } else if (lastName != null) {
            greetMessage = "Hello " + firstName;
        } else {
            greetMessage = "Hello World! ";
        }
        Greeting greeting = new Greeting(greetMessage);
        greetingRepository.save(greeting);

        return greetMessage;
    }

    //UC-06
    public Greeting saveGreeting(String firstName, String lastName) {
        String message;

        if (firstName != null && !firstName.isEmpty() && lastName != null && !lastName.isEmpty()) {
            message = "Hello, " + firstName.trim() + " " + lastName.trim() + "!";
        } else if (firstName != null && !firstName.isEmpty()) {
            message = "Hello, " + firstName.trim() + "!";
        } else if (lastName != null && !lastName.isEmpty()) {
            message = "Hello, " + lastName.trim() + "!";
        } else {
            message = "Hello World!";
        }

        message = message.replaceAll("\\s+", " ").trim(); // Remove extra spaces or newlines

        Greeting greeting = new Greeting(message);
        return greetingRepository.save(greeting);
    }


    //UC-06 Ability for the Greeti App to List all the Greeting Messages in the Repository
    public List<Greeting> getAllGreetings() {
        return greetingRepository.findAll();
    }
}
