package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;        // ID of the user giving the feedback
    private Long complaintId;   // ID of the complaint the feedback is related to
    private String comments;    // Feedback comments
    private int rating;         // Rating, e.g., 1 to 5
}
