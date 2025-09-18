package com.example.demo.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Complaint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;         // ID of the user who submitted the complaint
    private Long departmentId;   // ID of the department handling the complaint
    private Long officerId;      // ID of the officer assigned (optional)

    private String title;        // Short title of the complaint
    private String description;  // Detailed description of the complaint
    private String status;       // Status: Pending, In Progress, Resolved
    private LocalDateTime createdAt; // Timestamp when complaint was created
    private LocalDateTime updatedAt; // Timestamp for last update
}
