package com.kodilla.testing.calculator;

public class Calculator {
    private double variableA;
    private double variableB;

    public Calculator(double variableA, double variableB) {
        this.variableA = variableA;
        this.variableB = variableB;
    }

    public double addAToB() {
        return variableA + variableB;
    }

    public double substractAFromB() {
        return variableA - variableB;
    }
}
