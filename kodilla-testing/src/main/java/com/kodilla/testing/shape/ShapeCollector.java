package com.kodilla.testing.shape;

import com.kodilla.testing.forum.ForumPost;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> shapes = new ArrayList<Shape>();

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }


    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapes.contains(shape)) {
            shapes.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int number) {
        Shape shape = null;
        if (number >= 0 && number < shapes.size()) {
            shape = shapes.get(number);
        }
        return shape;
    }

    public ArrayList<Shape> showFigures(ArrayList<Shape> shapes) {
        return shapes;
    }

    public int shapesQuantity() {
        return shapes.size();
    }

}
