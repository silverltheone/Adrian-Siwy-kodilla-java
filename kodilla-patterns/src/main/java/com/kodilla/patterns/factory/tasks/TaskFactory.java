package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPINGTASK = "SHOPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPINGTASK:
                return new ShoppingTask("Shoping", "Apples", 5.0);
            case PAINTINGTASK:
                return new PaintingTask("Painting", "Blue", "Wall");
            case DRIVINGTASK:
                return new DrivingTask("Driving", "To School", "Van");
            default:
                return null;
        }
    }
}
