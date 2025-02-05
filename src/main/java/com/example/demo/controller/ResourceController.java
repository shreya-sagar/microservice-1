package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

    @GetMapping("/health-check")
    public String healthCheck() {
        return "Microservice-1 is working fine!";
    }
}
