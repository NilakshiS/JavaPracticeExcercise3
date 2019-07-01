package com.stackroute.pe3;

import java.util.Scanner;

public class StudentMarks {
//    public static void main(String[] args) {
//        int[] stuGrades;
//        int numOfStudents;
//        Scanner input = new Scanner(System.in);
//        try {
//            System.out.println("Enter number of students: ");
//            numOfStudents = input.nextInt();
//            stuGrades = new int[numOfStudents];
//            for (int i = 0; i < numOfStudents; i++){
//                System.out.print("Enter grades for student "+(i+1)+": ");
//                stuGrades[i] = input.nextInt();
//                if (stuGrades[i] < 0 || stuGrades[i] > 100) {
//                    throw new Exception();
//                }
//                System.out.println();
//            }
//        }
//        catch (Exception e){
//            System.out.println("Error! Number of students less than 0 or greater than 100!");
//        }
//    }
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
