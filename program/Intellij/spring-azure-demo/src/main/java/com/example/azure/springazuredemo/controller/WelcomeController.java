package com.example.azure.springazuredemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class WelcomeController {
        @GetMapping("welcome")
    public String wish(){
            return "Welcome to Azure";
        }
}
