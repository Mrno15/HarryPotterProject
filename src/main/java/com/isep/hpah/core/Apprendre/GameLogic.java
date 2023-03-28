package com.isep.hpah.core.Apprendre;

import java.util.Scanner;

public class GameLogic {
    static Scanner scanner = new Scanner(System.in);

    public static void anythingToContinue(){
        System.out.println(" \nEnter 1 to continue");
        scanner.next();
    }

    public static void spaceBetweenText(){
        for (int i =0; i <1; i++ )
            System.out.println();
    }

    public static void clearConsole(){
        for (int i =0; i <100; i++ )
            System.out.println();
    }




}
