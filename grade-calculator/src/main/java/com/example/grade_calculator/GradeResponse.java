package com.example.grade_calculator;

public class GradeResponse {
    private int marks;
    private String grade;

    public GradeResponse(int marks ,String grade){
        this.marks = marks;
        this.grade = grade;
    }

    public int getMarks(){
        return marks;
    }
    public String getGrade(){
        return grade;
    }
    
}
