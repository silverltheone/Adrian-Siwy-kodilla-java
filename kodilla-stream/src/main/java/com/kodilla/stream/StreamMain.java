package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;

import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        expressionExecutor.executeExpression(10,5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a / b);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Kiedy przyjdą podpalić dom", (poem -> "ABC "  + poem + " CBA"));
        poemBeautifier.beautify("Litwo ojczyzna moja", (poem -> toUpperCase(poem)));
        poemBeautifier.beautify("Jak kamienie przez Boga rzucane na szaniec", (poem -> "***" + poem + "***"));
        poemBeautifier.beautify("WLAZ KOTEK NA PLOTEK", (poem -> toLowerCase(poem)));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }


}
