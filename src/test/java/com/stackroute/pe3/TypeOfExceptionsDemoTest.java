package com.stackroute.pe3;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class TypeOfExceptionsDemoTest {
    static TypeOfExceptionsDemo typeOfExceptionsDemo;

    @BeforeClass
    public static void setUp() {
        typeOfExceptionsDemo = new TypeOfExceptionsDemo();
    }

    @AfterClass
    public static void tearDown() {
        typeOfExceptionsDemo = null;
    }

    @Test
    public void givenNegativeArraySizeShoulReturnNegativeArrayIndexException() {
        //Arrange
        //Act
        String result = typeOfExceptionsDemo.causeException(-2);
        //Assert
        assertEquals( "Caught Negative Array Size Exception -2",result);
    }

    @Test
    public void givenNullShouldReturnNullPointerException() {
        //Arrange
        //Act
        String result = typeOfExceptionsDemo.causeException(null);
        //Assert
        assertEquals( "Caught Null Pointer Exception: null",result);
    }

    @Test
    public void givenArraySizeShouldReturnIndexOutOfBoundsException() {
        //Arrange
        //Act
        String result = typeOfExceptionsDemo.causeException(5);
        //Assert
        assertEquals("Caught index out of bounds exception: Index 6 out of bounds for length 5", result);
    }
}