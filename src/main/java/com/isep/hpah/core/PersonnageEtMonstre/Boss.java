package com.isep.hpah.core.PersonnageEtMonstre;

import lombok.Data;
import lombok.experimental.SuperBuilder;
@Data
@SuperBuilder
public class Boss extends Caractere{
//    public Boss(String name) {
//        super(name, 2000, 0);
//    }

    public int attack() {
        return 0;
    }

    public int defence() {
        return 0;
    }
}
