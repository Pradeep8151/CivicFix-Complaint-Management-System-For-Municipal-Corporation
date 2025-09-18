package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Attachment;
import com.example.demo.repository.AttachmentRepository;

@Service
public class AttachmentService {

    private final AttachmentRepository repo;

    public AttachmentService(AttachmentRepository repo) {
        this.repo = repo;
    }

    public List<Attachment> getAllAttachments() {
        return repo.findAll();
    }

    public Optional<Attachment> getAttachmentById(Long id) {
        return repo.findById(id);
    }

    public Attachment createAttachment(Attachment attachment) {
        return repo.save(attachment);
    }

    public Attachment updateAttachment(Attachment attachment) {
        return repo.save(attachment);
    }

    public void deleteAttachment(Long id) {
        repo.deleteById(id);
    }
}
