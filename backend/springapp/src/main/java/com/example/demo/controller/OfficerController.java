package com.example.demo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Officer;
import com.example.demo.service.OfficerService;

@RestController
@RequestMapping("/api/officer")
public class OfficerController {

    private final OfficerService service;

    public OfficerController(OfficerService service) {
        this.service = service;
    }

    @GetMapping
    public List<Officer> getAllOfficers() {
        return service.getAllOfficers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Officer> getOfficerById(@PathVariable Long id) {
        return service.getOfficerById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Officer createOfficer(@RequestBody Officer officer) {
        return service.createOfficer(officer);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Officer> updateOfficer(@PathVariable Long id, @RequestBody Officer officer) {
        officer.setId(id);
        return ResponseEntity.ok(service.updateOfficer(officer));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOfficer(@PathVariable Long id) {
        service.deleteOfficer(id);
        return ResponseEntity.noContent().build();
    }
}
