package com.isep.hpah.core.PersonnageEtMonstre;

import lombok.Data;

import java.util.Scanner;

@Data
public abstract class Caractere {
    private String name;
    private int maxHp, hp, xp, precision;

    public Caractere(String name, int maxHP, int xp, double precision){
        this.name = name;
        this.maxHp = maxHp;
        this.xp = xp;
        this.hp = maxHp;
        this.precision = (int) precision;
    }

    public static String nomInt(String prompt) {
        Scanner sc = new Scanner(System.in);
        String Name;
        System.out.print("Quelle nom souhaitez vous donner a votre personnage");
        Name = sc.nextLine();
        System.out.println("Vous avez saisi : " + Name);
        return (Name);

    }

    int changeHp = 0;
    public abstract int attack();
    public abstract int defence();


}
