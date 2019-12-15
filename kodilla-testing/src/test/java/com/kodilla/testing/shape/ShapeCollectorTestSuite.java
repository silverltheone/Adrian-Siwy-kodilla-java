package com.kodilla.testing.shape;

import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is beginning of the tests.");
    }

    @AfterClass
    public static void aterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(new Circle (10.5));
        shapeCollector.addFigure(new Triangle(10.0, 15.0));
        shapeCollector.addFigure(new Square(4.0));
        //then
        Assert.assertEquals(3, shapeCollector.shapesQuantity());
    }

    @Test
    public void testRemoveFigureNotExisting() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Circle(5.0);
        //When
        boolean result = shapeCollector.removeFigure(shape);
        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemoveFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Circle(5.0);
        shapeCollector.addFigure(new Circle(5.0));
        //When
        boolean result = shapeCollector.removeFigure(shape);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeCollector.shapesQuantity());
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Circle(7.0);
        shapeCollector.addFigure(new Circle(7.0));
        //When
        Shape retrievedShape;
        retrievedShape = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(shape, retrievedShape);
    }
}
