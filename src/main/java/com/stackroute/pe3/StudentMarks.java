package com.stackroute.pe3;

public class StudentMarks {
    public String checkGrades(int numOfStudents,int[] stuGrades){
        try {
            for (int i = 0; i < numOfStudents; i++){
                if (stuGrades[i] < 0 || stuGrades[i] > 100){
                    throw new Exception("Error! Number of students less than 0 or greater than 100!");
                }
            }
            return "Grades are valid";
        }
        catch (Exception e){
            return e.getMessage();
        }
    }
}
