package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Officer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;        // Officer's full name
    private String email;       // Email for login and notifications
    private String password;    // Password for authentication
    private String phone;       // Contact number
    private String department;  // Department assigned (e.g., Sanitation, Water, Roads)
    private String role;        // Role: Officer / Admin
}
