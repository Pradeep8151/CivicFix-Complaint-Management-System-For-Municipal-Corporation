package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;        // Full name of the user
    private String email;       // Email for login and notifications
    private String password;    // Password for authentication
    private String phone;       // Contact number
    private String role;        // Role: Admin / Citizen / Staff
    private String address;     // User's address
}
