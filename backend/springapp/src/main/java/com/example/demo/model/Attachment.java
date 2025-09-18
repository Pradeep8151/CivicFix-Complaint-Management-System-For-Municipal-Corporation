package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Attachment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long complaintId;   // ID of the complaint this attachment belongs to
    private String fileName;    // Original file name
    private String fileType;    // File type (e.g., image/png, application/pdf)
    private String filePath;    // Path or URL where the file is stored
}
