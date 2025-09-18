package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Officer;
import com.example.demo.repository.OfficerRepository;

@Service
public class OfficerService {

    private final OfficerRepository repo;

    public OfficerService(OfficerRepository repo) {
        this.repo = repo;
    }

    public List<Officer> getAllOfficers() {
        return repo.findAll();
    }

    public Optional<Officer> getOfficerById(Long id) {
        return repo.findById(id);
    }

    public Officer createOfficer(Officer officer) {
        return repo.save(officer);
    }

    public Officer updateOfficer(Officer officer) {
        return repo.save(officer);
    }

    public void deleteOfficer(Long id) {
        repo.deleteById(id);
    }
}
