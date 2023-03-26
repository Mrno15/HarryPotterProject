package com.isep.hpah.core;


import com.isep.hpah.core.Apprendre.GameLogic;
import com.isep.hpah.core.Baguette.Core;
import com.isep.hpah.core.PersonnageEtMonstre.Caractere;
import com.isep.hpah.core.House.SortingHat;
import com.isep.hpah.core.PersonnageEtMonstre.Sorcier;

public class Main {
    public static void main(String[] args) {


        System.out.println("You choise number " + "2" );
        GameLogic.spaceBetweenText();
/*
        String House = SortingHat.getHouse("Oh  sorcerer, this is your house");
        System.out.println("You choise number " + House);
        GameLogic.spaceBetweenText();

        Core.nomCore();
        GameLogic.spaceBetweenText();
*/
        new Sorcier("ton nom");

        System.out.println();
    }
}
