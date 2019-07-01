package com.stackroute.pe3;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionDemoTest {
    static ExceptionDemo exceptionDemo;

    @BeforeClass
    public static void setUp() {
        exceptionDemo = new ExceptionDemo();
    }

    @AfterClass
    public static void tearDown() {
        exceptionDemo = null;
    }

    @Test
    public void testExceptionThrow() {
        //Arrange
        //Act
        String result = exceptionDemo.exceptionThrow();
        //Assert
        assertEquals( "Caught the exception with message: Exception thrown\nIn finally!",result);
    }
}