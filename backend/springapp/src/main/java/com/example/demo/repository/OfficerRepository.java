package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Officer;

@Repository
public interface OfficerRepository extends JpaRepository<Officer, Long> {

}
