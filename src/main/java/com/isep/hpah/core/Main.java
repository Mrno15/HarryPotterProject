package com.isep.hpah.core;


import com.isep.hpah.core.Apprendre.GameLogic;
import com.isep.hpah.core.Apprendre.Pet;
import com.isep.hpah.core.Baguette.Core;
import com.isep.hpah.core.PersonnageEtMonstre.Caractere;
import com.isep.hpah.core.House.SortingHat;
import com.isep.hpah.core.PersonnageEtMonstre.Sorcier;
import lombok.Data;

import java.util.Scanner;
@Data
public class Main {
    public static void main(String[] args) {

        Niveaux.introGame();
        Scanner scanner = new Scanner(System.in);
        System.out.println("You choise number " + "2" );
        GameLogic.spaceBetweenText();
/*
        String House = SortingHat.getHouse("Oh  sorcerer, this is your house");
        System.out.println("You choise number " + House);
        GameLogic.spaceBetweenText();

        Core.nomCore();
        GameLogic.spaceBetweenText();
*/
        System.out.println("rentre un nom");
        String nom = scanner.nextLine();
        Sorcier sorcier = Sorcier.createSorcier(nom);

        System.out.println(sorcier.getName()+"est donc ton nom");
        sorcier.setHouse(SortingHat.getHouse());





        sorcier.setPet(Pet.nomPet());
        System.out.println(sorcier.getPet() + " est mon annimal pref <3 love (nothing sexual) impostor sounds start playing");


        Core.nomCore();



    }
}
