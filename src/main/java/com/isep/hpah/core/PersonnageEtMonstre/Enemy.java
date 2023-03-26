package com.isep.hpah.core.PersonnageEtMonstre;

public class Enemy extends Caractere{

    public Enemy(String name, int maxHP, int xp) {
        super(name, maxHP, xp);
    }

    public int attack() {
        return 50;
    }

    public int defence() {
        return 0;
    }


    public static int healthChangeEnemy (int hp){
        return hp;
    }

    public static int xpChangeEnemy (int hp){
        return hp;
    }



}
