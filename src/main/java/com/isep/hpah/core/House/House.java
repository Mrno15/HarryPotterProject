package com.isep.hpah.core.House;

import lombok.Getter;

import java.util.Random;

@Getter
public enum House {
    Griffondor,
    Poussoufle,
    Serdaigle,
    Serpentard;

    public static House chooseHouse(){
        Random rand = new Random();
        return values()[rand.nextInt(3)];
    }
}
