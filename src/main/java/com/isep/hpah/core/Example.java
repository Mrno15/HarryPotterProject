package com.isep.hpah.core;

import com.isep.hpah.core.Sorcier;

public class Example {
    public static void main(String[] args){
        Sorcier mySorcier = new Sorcier();

        mySorcier.getLongueur();
        mySorcier.getName();
        mySorcier.getLongueur();


        System.out.println(mySorcier.getLongueur());
        System.out.println(mySorcier.getName());
        System.out.println(mySorcier.getLongueur());
    }
}