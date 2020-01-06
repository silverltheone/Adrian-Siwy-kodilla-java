package com.kodilla.rps;

import com.kodilla.rps.UserSelection;

import java.util.Scanner;

public class UserDialogs {
    public static UserSelection getUserSelection() {
        Scanner scanPickForPlayerOne = new Scanner(System.in);
        while(true) {
            System.out.println("Wybierz swój ruch: [1] Kamień - [2] Papier - [3] Nożyce");
            String pickedSign = scanPickForPlayerOne.nextLine();
            switch(pickedSign) {
                case "1": System.out.println("Wybrałeś [1] - Kamień");
                return UserSelection.ROCK;
                case "2": System.out.println("Wybrałeś [2] - Papier");
                return UserSelection.PAPER;
                case "3": System.out.println("Wybrałeś [3] = Nożyce");
                return UserSelection.SCISSORS;
                default:
                    System.out.println("Zły wybór spróbuj jeszcze raz");
            }
        }
    }

    static String getPlayerOneName() {
        Scanner scanPlayerOneName = new Scanner(System.in);
        System.out.println("Podaj nazwę pierwszego gracza");
        String playerOneName = scanPlayerOneName.nextLine();
        System.out.println("Witaj " + playerOneName);
        System.out.println("Zagrasz przeciwko KOMPUTEROWI");
        return playerOneName;
    }

    static int getPointsLimit() {
        Scanner scanPointsLimit = new Scanner((System.in));
        System.out.println("Wybierz limit punktów");
        int pointsLimit = scanPointsLimit.nextInt();
        System.out.println("Zagracie do " + pointsLimit + " punktów");
        return pointsLimit;
    }
}
