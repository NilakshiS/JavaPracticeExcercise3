package com.stackroute.pe3;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlaceVowelTest {

    static PlaceVowel placeVowel;

    @BeforeClass
    public static void setUp() {
        placeVowel = new PlaceVowel();
    }

    @AfterClass
    public static void tearDown() {
        placeVowel = null;
    }

    @Test
    public void testExceptionThrow() {
        //Arrange
        //Act
        String[] result = placeVowel.replaceVowels(new String[]{"India","United States","Germany","Egypt","Czechoslovakia"});
        //Assert
        assertArrayEquals( new String[]{"Ind","Untd Stts","Grmny","Egypt","Czchslvk"},result);
    }

}