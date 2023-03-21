package com.isep.hpah.core;

import lombok.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
com.isep.hpah.core.Sorcier avec baguette, potion et une maison
 */
@Getter @Setter
public class Sorcier {
    private String name;
    private String house;
    private String core;
    private int longueur;

    public static void main(String[] args) throws Exception {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr); // permet de lire les chaines de caractères
        Scanner sc;
        System.out.print("Quelle est le nom de votre sorcier??");
        String name = br.readLine();
        System.out.println(name);

        System.out.println();
        System.out.println(name);
        System.out.println(name);

    }



}

