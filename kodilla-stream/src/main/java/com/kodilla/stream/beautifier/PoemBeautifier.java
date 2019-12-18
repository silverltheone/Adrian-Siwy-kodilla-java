package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify (String poem, PoemDecorator poemDecorator) {
        String chengedPoem = poemDecorator.decorate(poem);
        System.out.println(chengedPoem);
    }
}
