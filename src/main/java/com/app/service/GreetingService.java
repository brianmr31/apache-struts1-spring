package com.app.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String getPersonalizedGreeting(String name) {
        if (name == null || name.trim().isEmpty()) {
            name = "Pengguna Struts 1";
        }
        return "Halo, " + name + "! Pesan ini berasal dari Service Layer Spring.";
    }
}