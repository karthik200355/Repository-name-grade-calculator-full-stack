package com.example.grade_calculator;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@CrossOrigin(origins = {"http://localhost:5500", "http://127.0.0.1:5500"})
public class GradeController{
    
    @PostMapping("/api/grades/calculate")
    public GradeResponse calculateGrade(@RequestBody int marks){
        
        if(marks <0 || marks>100){
            return new GradeResponse(marks,"Invalid marks");
        }

        if(marks >=90){
            return new GradeResponse(marks, "A");
        }

        else if (marks >= 80) {
            return new GradeResponse(marks, "B");
        } 
        else if (marks >= 70) {
            return new GradeResponse(marks, "C");
        } 
        else if (marks >= 60) {
           return new GradeResponse(marks, "D");
        } 
        else {
            return new GradeResponse(marks, "F");
        }
    }
}