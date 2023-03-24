package com.isep.hpah.core.PersonnageEtMonstre;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public abstract class Caractere {
    public String name;
    private int maxHp, hp, xp, precision;

    public Caractere(String name, int maxHP, int xp){
        this.name = name;
        this.maxHp = maxHp;
        this.xp = xp;
        this.hp = maxHp;
        this.precision = precision;
    }

    public static String nomInt(String prompt) {
        Scanner sc = new Scanner(System.in);
        String Name;

        System.out.print("Quelle nom souhaitez vous donner a votre personnage");
        Name = sc.nextLine();


        System.out.println("Vous avez saisi : " + Name);
        return (Name);

    }

    public abstract int attack();
    public abstract int defence();


}
