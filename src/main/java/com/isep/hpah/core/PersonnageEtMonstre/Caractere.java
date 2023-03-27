package com.isep.hpah.core.PersonnageEtMonstre;

import lombok.*;
import lombok.experimental.SuperBuilder;
import java.util.Scanner;

@Data
@SuperBuilder(toBuilder = true)
public abstract class Caractere {
    private String name;
    private int maxHp, hp, xp, precision;






    public abstract int attack();
    public abstract int defence();


}
