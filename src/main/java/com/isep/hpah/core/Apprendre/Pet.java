package com.isep.hpah.core.Apprendre;

import lombok.Getter;

import javax.management.Query;
import java.util.Scanner;

@Getter
public enum Pet {
    Rat,
    Dog,
    Cat;



    public static Pet nomPet() {

        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Veuillez choisir une option :");
            System.out.println("1. Rat");
            System.out.println("2. Cat");
            System.out.println("3. Dog");
            String choix = scanner.nextLine();

            switch (choix) {
                case "1":
                    System.out.println("Vous avez choisi un Rat comme animaux de compagnie");
                    return Rat;
                case "2":
                    System.out.println("You choose a Cat ");
                    return Cat;
                case "3":
                    System.out.println("You choose a Dog ");
                    return Dog;
                default:
                    System.out.println("Option invalide");
                    break;
            }

        }



    }

}