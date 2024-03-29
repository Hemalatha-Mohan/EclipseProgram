package com.example.azure.springsecurityazure.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class HelloController {
    @GetMapping("/group1")
    @PreAuthorize("hasRole('ROLE_group1')")
    public String group1(){
        return "Hello Group1 Users";
    }

    @GetMapping("/group2")
    @PreAuthorize("hasRole('ROLE_group2')")
    public String group2(){
        return "Hello Group2 users";
    }
}
