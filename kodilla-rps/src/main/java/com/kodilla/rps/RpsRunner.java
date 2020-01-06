package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        Mode gameMode = new Mode();
        Scanner scanPickMode = new Scanner(System.in);
        System.out.println("Wybierz tryb gry: [1] Normalny - [2] Początkujący");
        String pickedSign = scanPickMode.nextLine();
        switch (pickedSign) {
            case "1":
                System.out.println("Wybrałeś [1] - Tryb normalny");
                gameMode.runNormalMode();
            case "2":
                System.out.println("Wybrałeś [2] - Tryb Początkujący");
                gameMode.runEasyMode();
            default:
                System.out.println("Zły wybór spróbuj jeszcze raz");
        }
    }
}

