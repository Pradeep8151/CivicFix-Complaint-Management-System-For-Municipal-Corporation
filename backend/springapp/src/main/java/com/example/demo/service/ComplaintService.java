package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Complaint;
import com.example.demo.repository.ComplaintRepository;

@Service
public class ComplaintService {

    private final ComplaintRepository repo;

    public ComplaintService(ComplaintRepository repo) {
        this.repo = repo;
    }

    public List<Complaint> getAllComplaints() {
        return repo.findAll();
    }

    public Optional<Complaint> getComplaintById(Long id) {
        return repo.findById(id);
    }

    public Complaint createComplaint(Complaint complaint) {
        return repo.save(complaint);
    }

    public Complaint updateComplaint(Complaint complaint) {
        return repo.save(complaint);
    }

    public void deleteComplaint(Long id) {
        repo.deleteById(id);
    }
}
