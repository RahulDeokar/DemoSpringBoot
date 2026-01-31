package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin("http://localhost:4200/")
public class MainController {

    @GetMapping("/home")
    public String home() {
        return "Welcome to Spring Boot Demo Home!";
    }

    @GetMapping("/gate")
    public List<String> gateErrors() {
        return List.of("Error 1: Invalid input", "Error 2: Access denied", "Error 3: Timeout");
    }

    @GetMapping("/greeting")
    public Map<String, String> greetings() {
        return Map.of(
                "greeting1", "Hello User!",
                "greeting2", "Hi there!",
                "greeting3", "Welcome to the demo!"
        );
    }
}
