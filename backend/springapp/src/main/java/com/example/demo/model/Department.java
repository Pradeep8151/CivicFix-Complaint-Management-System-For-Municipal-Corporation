package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;          // Department name (e.g., Sanitation, Water, Roads)
    private String contactPerson; // Name of the department head or contact person
    private String phone;         // Department phone number
    private String email;         // Department email
}
