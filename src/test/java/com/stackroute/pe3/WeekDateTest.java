package com.stackroute.pe3;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class WeekDateTest {
    static WeekDate weekDate;

    @BeforeClass
    public static void setUp(){
        weekDate = new WeekDate();
    }

    @AfterClass
    public static void tearDown(){
        weekDate = null;
    }

    @Test
    public void testDates(){
        //Arrange
        //Act
        String result = weekDate.getDates();
        //Assert
        assertEquals("Mon 01/07/19 Sun 07/07/19",result);
    }

}