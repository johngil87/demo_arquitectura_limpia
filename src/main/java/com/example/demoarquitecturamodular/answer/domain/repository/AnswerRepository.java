package com.example.demoarquitecturamodular.answer.domain.repository;

import com.example.demoarquitecturamodular.answer.domain.Answer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AnswerRepository extends MongoRepository<Answer, String> {
}
