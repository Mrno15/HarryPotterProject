package com.isep.hpah.core;
import com.isep.hpah.core.Apprendre.GameLogic;
import com.isep.hpah.core.PersonnageEtMonstre.Sorcier;

import java.util.Scanner;


public enum Spell {
    Wirgardium_Leviosa,
    Expecto_Patronum,
    Accio,
    Sectumsempra,
    avada_kedrava,
    experlliarmus;

    public static void allSpell(Sorcier sorcier) {
        GameLogic.clearConsole();
        int input = sorcier.getXp();
        if (input == 0) {
            System.out.println("Choose one of the spell :");
            System.out.println("1. Wirgardium_Leviosa");
        }
        else if (input == 2) {

        System.out.println("Choose one of the spell :");
        System.out.println("1. Wirgardium_Leviosa");
        System.out.println("Choose one of the spell :");
        }
        else if (input == 3) {

            System.out.println("Choose one of the spell :");
            System.out.println("1. Wirgardium_Leviosa");
            System.out.println("Choose one of the spell :");
            System.out.println("Choose one of the spell :");
            System.out.println("Choose one of the spell :");
            System.out.println("Choose one of the spell :");
        }
        else if (input == 4) {
            System.out.println("Choose one of the spell :");
            System.out.println("1. Wirgardium_Leviosa");
            System.out.println("Choose one of the spell :");
            System.out.println("Choose one of the spell :");
            System.out.println("Choose one of the spell :");
        }
        else if (input == 5) {
            System.out.println("Choose one of the spell :");
            System.out.println("1. Wirgardium_Leviosa");
            System.out.println("Choose one of the spell :");
            System.out.println("Choose one of the spell :");
            System.out.println("Choose one of the spell :");
        }
    }

    public static Spell nomSort(Sorcier sorcier) {
        Scanner scanner = new Scanner(System.in);
        allSpell(sorcier);
        int xp = sorcier.getXp();
        while (true) {
            if (xp == 0) {

                int core = scanner.nextInt();
                switch (core) {
                    case 1:
                        System.out.println("Vous avez choisi Coeur de licorne");
                        return Wirgardium_Leviosa;

                    default:
                        System.out.println("Option invalide");
                        break;
                }
            } else {

                int core = scanner.nextInt();
                switch (core) {
                    case 1:
                        System.out.println("Vous avez choisi Coeur de licorne");
                        return Wirgardium_Leviosa;
                    case 2:
                        System.out.println("Vous avez choisi Corne de dragon");
                        return Expecto_Patronum;
                    case 3:

                        System.out.println("Vous avez choisi Barbe de dumbeldore");
                        return Accio;
                    default:
                        System.out.println("Option invalide");
                        break;
                }
            }
        }
    }

    public static String[] Sort = {};
}