package com.example.quiz;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/answers")
public class AnswerController {
  @Autowired
  private AnswerRepository qz;

  @RequestMapping(method = RequestMethod.POST)
  public Answer addAnswer(@RequestBody Answer answer )
  {
    
    return qz.saveAndFlush(answer);
  }

   @RequestMapping(method = RequestMethod.GET)
  public List<Answer> viewAnswer(@RequestBody Answer answer)
  {
     return qz.findAll();
  }
}