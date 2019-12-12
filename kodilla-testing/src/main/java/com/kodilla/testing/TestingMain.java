package com.kodilla.testing;
import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUserName();

        if (result.equals("theForumUser")){
            System.out.println("Test OK");
        } else {
            System.out.println("Error");
        }

        double varA = 7.0;
        double varB = 2.0;
        Calculator calculator = new Calculator(varA, varB);
        if (calculator.addAToB() == varA + varB) {
            System.out.println("Calculator Test1: Test OK");
        } else {
            System.out.println("Calculator Test1: Error");
        }

        if (calculator.substractAFromB() == varA - varB) {
            System.out.println("Calculator Test2: Test OK");
        } else {
            System.out.println("Calculator Test2: Error");
        }
    }
}
