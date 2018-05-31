package com.example.quiz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import com.example.quiz.Question;

public interface QuizRepository extends JpaRepository<Question,Serializable> {



}