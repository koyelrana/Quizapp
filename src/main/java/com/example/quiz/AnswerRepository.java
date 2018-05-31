package com.example.quiz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import com.example.quiz.Answer;

public interface AnswerRepository extends JpaRepository<Answer,Serializable> {



}