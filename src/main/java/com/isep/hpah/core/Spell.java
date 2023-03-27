package com.isep.hpah.core;
import java.util.Scanner;


public enum Spell {
    Sort1,
    Sort2,
    Sort3;


    public static void premierSort() {
        System.out.println("Choose one of the sort :");
        System.out.println("1. Sort1");
        System.out.println("2. Sort2");
    }

    public static void deuxiemeSort1() {
        System.out.println("Choose one of the sort :");
        System.out.println("1. Sort1");
        System.out.println("2. Sort2");
        System.out.println("3. Sort3");
    }


    public static Spell nomSort(int xp) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (xp == 0) {
                premierSort();
                int core = scanner.nextInt();
                switch (core) {
                    case 1:
                        System.out.println("Vous avez choisi Coeur de licorne");
                        return Sort1;
                    case 2:
                        System.out.println("Vous avez choisi Corne de dragon");
                        return Sort2;

                    default:
                        System.out.println("Option invalide");
                        break;
                }
            } else {
                deuxiemeSort1();
                int core = scanner.nextInt();
                switch (core) {
                    case 1:
                        System.out.println("Vous avez choisi Coeur de licorne");
                        return Sort1;
                    case 2:
                        System.out.println("Vous avez choisi Corne de dragon");
                        return Sort2;
                    case 3:

                        System.out.println("Vous avez choisi Barbe de dumbeldore");
                        return Sort3;
                    default:
                        System.out.println("Option invalide");
                        break;
                }
            }
        }
    }

    public static void degatSort(){


    }
}