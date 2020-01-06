package com.kodilla.rps;

import java.sql.SQLOutput;

public class Mode {
    private String playerOneName;
    private int playerOneScore;
    private int playerTwoScore;

    public void runNormalMode() {
        playerOneName = UserDialogs.getPlayerOneName();
        int pointsLimit = UserDialogs.getPointsLimit();
        playerOneScore = 0;
        playerTwoScore = 0;
        while(playerOneScore < pointsLimit && playerTwoScore < pointsLimit) {
            UserSelection pickedSign = UserDialogs.getUserSelection();
            UserSelection oponentPickedSign = GameLogic.getCompMove();
            Winner winner = GameLogic.selectWinner(pickedSign, oponentPickedSign);
            if(winner == Winner.PLAYERONE) {
                playerOneScore++;
                System.out.println("Brawo!!! Wygrana");
                System.out.println("Wynik to: " + playerOneName + ": " + playerOneScore +  " Komputer: " + playerTwoScore);
            } else if(winner == Winner.PLAYERTWO) {
                playerTwoScore++;
                System.out.println("Niestety, ta runda jest przegrana!");
                System.out.println("Wynik to: " + playerOneName + ": " + playerOneScore +  " Komputer: " + playerTwoScore);
            } else {
                playerOneScore++;
                playerTwoScore++;
                System.out.println("Ta runda zakończyła się remisem!");
                System.out.println("Wynik to: " + playerOneName + ": " + playerOneScore +  " Komputer: " + playerTwoScore);
            }
        }
        System.out.println("Ostateczny wynik to: " + playerOneName + ": " + playerOneScore +  " Komputer: " + playerTwoScore);
        if(playerOneScore>playerTwoScore) {
            System.out.println("JESTEŚ ZWYCIEZCĄ!!!");
        } else if (playerOneScore<playerTwoScore) {
            System.out.println("Niestety ten mecz zakończył się porażką.");
        } else {
            System.out.println("Mecz zakończył się remisem. Zwycięzcy brak!");
        }
    }

    public void runEasyMode() {
        playerOneName = UserDialogs.getPlayerOneName();
        int pointsLimit = UserDialogs.getPointsLimit();
        playerOneScore = 0;
        playerTwoScore = 0;
        while(playerOneScore < pointsLimit && playerTwoScore < pointsLimit) {
            UserSelection pickedSign = UserDialogs.getUserSelection();
            UserSelection oponentPickedSign = GameLogic.getEasyCompMove();
            Winner winner = GameLogic.selectWinner(pickedSign, oponentPickedSign);
            if(winner == Winner.PLAYERONE) {
                playerOneScore++;
                System.out.println("Brawo!!! Wygrana");
                System.out.println("Wynik to: " + playerOneName + ": " + playerOneScore +  " Komputer: " + playerTwoScore);
            } else if(winner == Winner.PLAYERTWO) {
                playerTwoScore++;
                System.out.println("Niestety, ta runda jest przegrana!");
                System.out.println("Wynik to: " + playerOneName + ": " + playerOneScore +  " Komputer: " + playerTwoScore);
            } else {
                playerOneScore++;
                playerTwoScore++;
                System.out.println("Ta runda zakończyła się remisem!");
                System.out.println("Wynik to: " + playerOneName + ": " + playerOneScore +  " Komputer: " + playerTwoScore);
            }
        }
        System.out.println("Ostateczny wynik to: " + playerOneName + ": " + playerOneScore +  " Komputer: " + playerTwoScore);
        if(playerOneScore>playerTwoScore) {
            System.out.println("JESTEŚ ZWYCIEZCĄ!!!");
        } else if (playerOneScore<playerTwoScore) {
            System.out.println("Niestety ten mecz zakończył się porażką.");
        } else {
            System.out.println("Mecz zakończył się remisem. Zwycięzcy brak!");
        }
    }

}
