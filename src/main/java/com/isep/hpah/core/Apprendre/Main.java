package com.isep.hpah.core.Apprendre;


import com.isep.hpah.core.Caractere;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test helper methods");
        GameLogic.anythingToContinue();
        int input = GameLogic.readInt("Enter 1,2,3:",3);
        System.out.println("You choise number " + input);
        int number = Caractere.nomInt("Mettez un chiffre");


    }
}
