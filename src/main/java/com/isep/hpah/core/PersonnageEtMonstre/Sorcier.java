package com.isep.hpah.core.PersonnageEtMonstre;

import com.isep.hpah.core.House.House;
import com.isep.hpah.core.PersonnageEtMonstre.Caractere;
import lombok.*;

/*
com.isep.hpah.core.PersonnageEtMonstre.Sorcier avec baguette, potion et une maison
 */
@Getter @Setter
public class Sorcier extends Caractere {

private House house;


    public Sorcier(String name) {
        super(name, 200, 0, 0.75);

    }





    public int attack() {
        return 0;
    }

    public int defence() {
        return 0;
    }
}

