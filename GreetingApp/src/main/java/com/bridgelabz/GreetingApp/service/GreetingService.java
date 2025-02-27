package com.bridgelabz.GreetingApp.service;

import com.bridgelabz.GreetingApp.Repository.GreetingRepository;
import com.bridgelabz.GreetingApp.model.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

    public Optional<Greeting> getGreetingById(Long id) {
        return greetingRepository.findById(id);
    }
}
