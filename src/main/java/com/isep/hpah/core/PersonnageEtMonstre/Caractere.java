package com.isep.hpah.core.PersonnageEtMonstre;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder(toBuilder = true)
public abstract class Caractere {
    private String name;
    private int maxHp, hp, xp, precision,potion;






    public abstract int attack();
    public abstract int defence();


}
