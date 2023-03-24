package com.isep.hpah.core.Baguette;
import java.util.Scanner;

public class Core {

    public static int nomCore() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez choisir une option :");
        System.out.println("1. Coeur de licorne");
        System.out.println("2. Corne de dragon");
        System.out.println("3. Barbe de dumbeldore");

        int choix = scanner.nextInt();

        switch (choix) {
            case 1:
                System.out.println("Vous avez choisi l'option 1");
                break;
            case 2:
                System.out.println("Vous avez choisi l'option 2");
                break;
            case 3:
                System.out.println("Vous avez choisi l'option 3");
                break;
            default:
                System.out.println("Option invalide");
                break;
        }

        scanner.close();

        return choix;
    }

}