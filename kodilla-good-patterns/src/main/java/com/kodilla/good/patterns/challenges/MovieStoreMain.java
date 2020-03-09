package com.kodilla.good.patterns.challenges;
import java.util.stream.Collectors;

public class MovieStoreMain {
    public static void main(String[] args) {

        String result = MovieStore.getMovies().entrySet().stream()
                .flatMap(entry -> entry.getValue().stream())
                .collect(Collectors.joining("!","",""));

        System.out.print(result);
    }
}
