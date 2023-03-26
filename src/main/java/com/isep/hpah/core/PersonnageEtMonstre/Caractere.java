package com.isep.hpah.core.PersonnageEtMonstre;

import lombok.Data;

import java.util.Scanner;

@Data
public abstract class Caractere {
    private String name;
    private int maxHp, hp, xp, precision;

    public Caractere(String name, int maxHP, int xp) {
        this.name = name;
        this.maxHp = maxHp;
        this.xp = xp;
        this.hp = hp;

    }




    public abstract int attack();
    public abstract int defence();


}
