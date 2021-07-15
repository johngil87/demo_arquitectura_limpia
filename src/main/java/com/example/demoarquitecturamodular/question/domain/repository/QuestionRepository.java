package com.example.demoarquitecturamodular.question.domain.repository;

import com.example.demoarquitecturamodular.question.domain.Question;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface QuestionRepository extends MongoRepository<Question, String> {
}
