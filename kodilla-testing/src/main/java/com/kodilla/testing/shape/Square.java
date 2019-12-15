package com.kodilla.testing.shape;

public class Square implements Shape {
    private double lenght;

    public Square(double lenght) {
        this.lenght = lenght;
    }

    public double getLenght() {
        return lenght;
    }

    @Override
    public String getShapeName() {
        return "square";
    }

    @Override
    public double getField() {
        return lenght * lenght;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        return Double.compare(square.lenght, lenght) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(lenght);
        return (int) (temp ^ (temp >>> 32));
    }
}
