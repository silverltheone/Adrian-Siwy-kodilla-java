package com.kodilla.rps;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GameLogic {

    static UserSelection getCompMove() {
        Random compChoiceGenerator = new Random();
        int oponentPickedSign = compChoiceGenerator.nextInt(3) + 1;

        if(oponentPickedSign ==  1) {
            System.out.println("Komputer wybrał [1] Kamień");
            return UserSelection.ROCK;
        } else if(oponentPickedSign == 2) {
            System.out.println("Komputer wybrał [2] Papier");
            return UserSelection.PAPER;
        } else {
            System.out.println("Komputer wybrał [3] Nożyce");
            return UserSelection.SCISSORS;
        }
    }

    static UserSelection getEasyCompMove() {
        Random compChoiceGenerator = new Random();
        int oponentPickedSign = compChoiceGenerator.nextInt(4) + 1;
        if(UserDialogs.getUserSelection() == UserSelection.ROCK) {
            if (oponentPickedSign == 1) {
                System.out.println("Komputer wybrał [1] Kamień");
                return UserSelection.ROCK;
            } else if(oponentPickedSign == 2) {
                System.out.println("Komputer wybrał [2] Papier");
                return UserSelection.PAPER;
            } else if(oponentPickedSign == 3) {
                System.out.println("Komputer wybrał [3] Nożyce");
                return UserSelection.SCISSORS;
            } else {
                System.out.println("Komputer wybrał [3] Nożyce");
                return UserSelection.SCISSORS;
            }
        } else if(UserDialogs.getUserSelection() == UserSelection.PAPER) {
            if (oponentPickedSign == 1) {
                System.out.println("Komputer wybrał [1] Kamień");
                return UserSelection.ROCK;
            } else if(oponentPickedSign == 2) {
                System.out.println("Komputer wybrał [2] Papier");
                return UserSelection.PAPER;
            } else if(oponentPickedSign == 3) {
                System.out.println("Komputer wybrał [3] Nożyce");
                return UserSelection.SCISSORS;
            } else {
                System.out.println("Komputer wybrał [1] Kamień");
                return UserSelection.ROCK;
            }
        } else {
            if (oponentPickedSign == 1) {
                System.out.println("Komputer wybrał [1] Kamień");
                return UserSelection.ROCK;
            } else if(oponentPickedSign == 2) {
                System.out.println("Komputer wybrał [2] Papier");
                return UserSelection.PAPER;
            } else if(oponentPickedSign == 3) {
                System.out.println("Komputer wybrał [3] Nożyce");
                return UserSelection.SCISSORS;
            } else {
                System.out.println("Komputer wybrał [2] Papier");
                return UserSelection.PAPER;
            }
        }
    }



    public static Winner selectWinner(UserSelection playerOne, UserSelection playerTwo) {
        Map<RoundSelection, Winner> winningMap = new HashMap<>();
        winningMap.put(new RoundSelection(UserSelection.ROCK, UserSelection.ROCK), Winner.DRAW);
        winningMap.put(new RoundSelection(UserSelection.ROCK, UserSelection.PAPER),Winner.PLAYERTWO);
        winningMap.put(new RoundSelection(UserSelection.ROCK, UserSelection.SCISSORS), Winner.PLAYERONE);
        winningMap.put(new RoundSelection(UserSelection.PAPER, UserSelection.PAPER), Winner.DRAW);
        winningMap.put(new RoundSelection(UserSelection.PAPER, UserSelection.ROCK), Winner.PLAYERONE);
        winningMap.put(new RoundSelection(UserSelection.PAPER, UserSelection.SCISSORS),Winner.PLAYERTWO);
        winningMap.put(new RoundSelection(UserSelection.SCISSORS, UserSelection.SCISSORS), Winner.DRAW);
        winningMap.put(new RoundSelection(UserSelection.SCISSORS, UserSelection.PAPER), Winner.PLAYERONE);
        winningMap.put(new RoundSelection(UserSelection.SCISSORS, UserSelection.ROCK), Winner.PLAYERTWO);

        return winningMap.get(new RoundSelection(playerOne, playerTwo));
    }

}
