package com.example.quiz;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/questions")
public class QuizController {
  @Autowired
  private QuizRepository qz;

  @RequestMapping(method = RequestMethod.POST)
  public Question addQuestion(@RequestBody Question question )
  {
    question.setId(null);
    return qz.saveAndFlush(question);
  }

   @RequestMapping(method = RequestMethod.GET)
  public List<Question> viewQuestion(@RequestBody Question question)
  {
     return qz.findAll();
  }
  @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
  public Question updateQuestion(@RequestBody Question updatequestion, @PathVariable Integer id) {
    updatequestion.setId(id);
    return qz.saveAndFlush(updatequestion);
  }
  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  public void  deleteQuestion(@PathVariable Integer id) {
    qz.deleteById(id);
  }
  }



     

        
        

        
         
            
            
        

        
        
        
         

            
            

            
             
                
                
            

            
            
            
             

                
                

                
                 
                    
                    
                

                
                
                
                 

                    
                    

                    
                     
                        
                        
                    

                    
                    
                    
                     

                        
                        

                        
                         
                            
                            
                        

                        
                        
                        
                         

                            
                            

                            
                             
                                
                                
                            

                            
                            
                            
                             

                                
                                

                                
                                 
                                    
                                    
                                

                                
                                
                                
                                 

                                    
                                    

                                    
                                     
                                        
                                        
                                    

                                    
                                    
                                    
                                     

                                        
                                        

                                        
                                         
                                            
                                            
                                        

                                        
                                        
                                        
                                         

                                            
                                            

                                            
                                             
                                                
                                                
                                            

                                            
                                            
                                            
                                             

                                                
                                                

                                                
                                                 
                                                    
                                                    
                                                

                                                
                                                
                                                
                                                 

                                                    
                                                    

     
