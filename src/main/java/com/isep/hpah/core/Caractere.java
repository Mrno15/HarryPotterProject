package com.isep.hpah.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public abstract class Caractere {
    public String name;
    private int maxHp, hp, xp;

    public Caractere(String name, int maxHP, int xp){
        this.name = name;
        this.maxHp = maxHp;
        this.xp = xp;
        this.hp = maxHp;
    }

    public static int nomInt(String prompt) {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.print("Veuillez saisir un nombre entre 0 et 20 : ");
            number = sc.nextInt();
        } while (number < 0 || number > 20);

        System.out.println("Vous avez saisi : " + number);
        return (number);

    }

    public abstract int attack();
    public abstract int defence();

}
