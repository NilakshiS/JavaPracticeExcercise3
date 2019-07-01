package com.stackroute.pe3;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumbersTest {
    static ConsecutiveNumbers consecutiveNumbers;
    @BeforeClass
    public static void setUp() {
        consecutiveNumbers = new ConsecutiveNumbers();
    }

    @AfterClass
    public static void tearDown() {
        consecutiveNumbers = null;
    }

    @Test
    public void givenConsecutiveNumbersShouldReturnConsecutiveNumbers() {
        //Arrange
        //Act
        String result = consecutiveNumbers.checkConsecutive("1,2,3,4,5,6,7");
        //Assert
        assertEquals("1,2,3,4,5,6,7 are consecutive numbers",result);
    }

    @Test
    public void givenNonConsecutiveNumbersShouldReturnNonConsecutiveNumbers() {
        //Arrange
        //Act
        String result = consecutiveNumbers.checkConsecutive("1,2,3,4,5,6,6");
        //Assert
        assertEquals("1,2,3,4,5,6,6 are not consecutive numbers",result);
    }

}