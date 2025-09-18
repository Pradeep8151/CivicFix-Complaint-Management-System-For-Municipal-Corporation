package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Department;
import com.example.demo.repository.DepartmentRepository;

@Service
public class DepartmentService {

    private final DepartmentRepository repo;

    public DepartmentService(DepartmentRepository repo) {
        this.repo = repo;
    }

    public List<Department> getAllDepartments() {
        return repo.findAll();
    }

    public Optional<Department> getDepartmentById(Long id) {
        return repo.findById(id);
    }

    public Department createDepartment(Department department) {
        return repo.save(department);
    }

    public Department updateDepartment(Department department) {
        return repo.save(department);
    }

    public void deleteDepartment(Long id) {
        repo.deleteById(id);
    }
}
