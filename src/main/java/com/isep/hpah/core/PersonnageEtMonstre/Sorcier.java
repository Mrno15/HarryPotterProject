package com.isep.hpah.core.PersonnageEtMonstre;

import com.isep.hpah.core.Apprendre.Pet;
import com.isep.hpah.core.Baguette.Core;
import com.isep.hpah.core.House.House;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Scanner;

/*
com.isep.hpah.core.PersonnageEtMonstre.Sorcier avec baguette, potion et une maison
 */
@Data
@SuperBuilder
public class Sorcier extends Caractere {


    private House house;

    private Pet pet;

    private Core core;


    public static String nomInt() {
        Scanner sc = new Scanner(System.in);
        String Name;
        System.out.print("Quelle nom souhaitez vous donner a votre personnage");
        Name = sc.nextLine();
        System.out.println("Vous avez saisi : " + Name);
        return (Name);

    }
//    public Sorcier(String name) {
//        super(name, 200, 0);
//
//    }
    public static Sorcier createSorcier(String name){
        Sorcier sorcier = Sorcier.builder()
                .name(name)
                .hp(100)
                .maxHp(200)
               // .potion(listpotion)
                .xp(0)
                .build();

        return sorcier;
    }


    public static void monterNiveaux(){
        //getxp
    }



    public int attack() {
        return 0;
    }

    public int defence() {
        return 0;
    }


    public static int healthChangeSorcier (int hp){
        return hp;
    }

    public static int xpChangeSorcier (int hp){
        return hp;
    }

    public static int bonusHealthChangeSorcier (int hp){
        return hp;
    }

    public static int bonusHpChangeSorcier (int hp){
        return hp;
    }
}

