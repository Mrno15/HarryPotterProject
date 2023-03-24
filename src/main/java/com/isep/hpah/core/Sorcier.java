package com.isep.hpah.core;

import lombok.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
com.isep.hpah.core.Sorcier avec baguette, potion et une maison
 */
@Getter @Setter
public class Sorcier extends Caractere{



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

