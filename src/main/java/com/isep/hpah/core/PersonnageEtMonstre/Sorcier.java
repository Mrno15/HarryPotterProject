package com.isep.hpah.core.PersonnageEtMonstre;

import com.isep.hpah.core.House.House;
import com.isep.hpah.core.PersonnageEtMonstre.Caractere;
import lombok.*;

import java.util.Scanner;

/*
com.isep.hpah.core.PersonnageEtMonstre.Sorcier avec baguette, potion et une maison
 */
@Data
public class Sorcier extends Caractere {

private House house;

    public static String nomInt(String prompt) {
        Scanner sc = new Scanner(System.in);
        String Name;
        System.out.print("Quelle nom souhaitez vous donner a votre personnage");
        Name = sc.nextLine();
        System.out.println("Vous avez saisi : " + Name);
        return (Name);

    }
    public Sorcier(String name) {
        super(name, 200, 0);

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

