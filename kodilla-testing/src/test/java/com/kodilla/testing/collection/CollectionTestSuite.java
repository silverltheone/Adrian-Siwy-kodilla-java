package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: Begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: End");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: Begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: End");
    }

    @Test
    public void testOddNumberExterminatorEmptyList() {
        //Given
        ArrayList<Integer> theList = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> evenNumbers = oddNumbersExterminator.exterminate(theList);
        //Then
        Assert.assertEquals(0, evenNumbers.size());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> theList = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        theList.add(2);
        theList.add(3);
        theList.add(4);
        theList.add(5);
        theList.add(0);
        theList.add(8);
        //When
        ArrayList<Integer> evenNumbers = oddNumbersExterminator.exterminate(theList);
        //Then
        ArrayList<Integer> expected = new ArrayList<>();
        for (int n = 0; n < theList.size(); n++) {
            if (theList.get(n) % 2 == 0) {
                expected.add(theList.get(n));
            }
        }
        Assert.assertEquals(expected, evenNumbers);
    }
}
