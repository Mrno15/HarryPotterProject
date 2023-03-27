package com.isep.hpah.core.Baguette;
import com.isep.hpah.core.PersonnageEtMonstre.Sorcier;
import lombok.Data;

import java.util.Scanner;

public enum Core {
    Coeur_de_licorne,
    Corne_de_dragon,
    Barbe_dumbeldore;


    public static void choixCore() {
        System.out.println("Veuillez choisir une option :");
        System.out.println("1. Coeur de licorne");
        System.out.println("2. Corne de dragon");
        System.out.println("3. Barbe de dumbeldore");
    }

    public static Core nomCore(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            choixCore();
            int core = scanner.nextInt();
        switch (core) {
            case 1:
                System.out.println("Vous avez choisi Coeur de licorne");
                return Coeur_de_licorne;
            case 2:
                System.out.println("Vous avez choisi Corne de dragon");
                return Corne_de_dragon;
            case 3:
                System.out.println("Vous avez choisi Barbe de dumbeldore");
                return Barbe_dumbeldore;
            default:
                System.out.println("Option invalide");
                break;
        }}




    }
}