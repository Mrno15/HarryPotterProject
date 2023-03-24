package com.isep.hpah.core;


import com.isep.hpah.core.Apprendre.GameLogic;
import com.isep.hpah.core.Baguette.Core;
import com.isep.hpah.core.PersonnageEtMonstre.Caractere;
import com.isep.hpah.core.House.SortingHat;

public class Main {
    public static void main(String[] args) {

        String Name = Caractere.nomInt("Mettez un chiffre");
        System.out.println("You choise number " + Name);
        GameLogic.spaceBetweenText();
        String House = SortingHat.getHouse("Oh  sorcerer, this is your house");
        System.out.println("You choise number " + House);
        GameLogic.spaceBetweenText();
        Core.nomCore();
        GameLogic.spaceBetweenText();
    }
}
