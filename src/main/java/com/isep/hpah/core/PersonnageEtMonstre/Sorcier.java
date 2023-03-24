package com.isep.hpah.core.PersonnageEtMonstre;

import com.isep.hpah.core.PersonnageEtMonstre.Caractere;
import lombok.*;

/*
com.isep.hpah.core.PersonnageEtMonstre.Sorcier avec baguette, potion et une maison
 */
@Getter @Setter
public class Sorcier extends Caractere {



    public Sorcier(String name, int maxHp, int xp) {

        super(name, maxHp, xp);
    }





    public int attack() {
        return 0;
    }

    public int defence() {
        return 0;
    }
}

