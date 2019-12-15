package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private double basis;
    private double height;

    public Triangle(double basis, double height) {
        this.basis = basis;
        this.height = height;
    }

    public double getBasis() {
        return basis;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String getShapeName() {
        return "triangle";
    }

    @Override
    public double getField() {
        return (basis * height) / 2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.basis, basis) != 0) return false;
        return Double.compare(triangle.height, height) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(basis);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
