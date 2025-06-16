package com.example.user_service.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping
    public String getUser() {
        return "User service is working";
    }
}
