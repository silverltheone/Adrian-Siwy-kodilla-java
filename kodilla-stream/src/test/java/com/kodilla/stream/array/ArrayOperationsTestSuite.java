package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] elements = {1,2,3};
        //When
        double average = ArrayOperations.getAverage(elements);
        //Then
        Assert.assertEquals(2, average, 0.001);
    }
}
