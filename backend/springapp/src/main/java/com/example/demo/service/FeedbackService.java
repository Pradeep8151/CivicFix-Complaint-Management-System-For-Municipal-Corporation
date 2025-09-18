package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Feedback;
import com.example.demo.repository.FeedbackRepository;

@Service
public class FeedbackService {

    private final FeedbackRepository repo;

    public FeedbackService(FeedbackRepository repo) {
        this.repo = repo;
    }

    public List<Feedback> getAllFeedbacks() {
        return repo.findAll();
    }

    public Optional<Feedback> getFeedbackById(Long id) {
        return repo.findById(id);
    }

    public Feedback createFeedback(Feedback feedback) {
        return repo.save(feedback);
    }

    public Feedback updateFeedback(Feedback feedback) {
        return repo.save(feedback);
    }

    public void deleteFeedback(Long id) {
        repo.deleteById(id);
    }
}
