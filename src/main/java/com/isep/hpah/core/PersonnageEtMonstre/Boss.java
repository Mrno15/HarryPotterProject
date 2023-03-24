package com.isep.hpah.core.PersonnageEtMonstre;

public class Boss extends Caractere{
    public Boss(String name, int maxHP, int xp) {
        super(name, maxHP, xp);
    }

    public int attack() {
        return 0;
    }

    public int defence() {
        return 0;
    }
}
