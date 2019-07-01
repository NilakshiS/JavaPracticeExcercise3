package com.stackroute.pe3;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {
    static StudentMarks studentMarks;

    @BeforeClass
    public static void setUp(){
        studentMarks = new StudentMarks();
    }

    @AfterClass
    public static void tearDown(){
        studentMarks = null;
    }

    @Test
    public void givenCorrectGradesShouldReturnValidGrades(){
        //Arrange
        //Act
        String result = studentMarks.checkGrades(4,new int[]{65,86,73,98});
        //Assert
        assertEquals("Grades are valid",result);
    }

    @Test
    public void givenIncorrectGradesShouldReturnError(){
        //Arrange
        //Act
        String result = studentMarks.checkGrades(4,new int[]{65,86,73,103});
        //Assert
        assertEquals("Error! Number of students less than 0 or greater than 100!",result);
    }
}