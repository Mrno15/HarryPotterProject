package com.isep.hpah.core.Baguette;

import com.isep.hpah.core.Sorcier;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Longueur {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Sorcier myL = new Sorcier();
            myL.getLongueur();
            int number;
            do {
                System.out.print("Veuillez saisir un nombre entre 0 et 20 : ");
                number = sc.nextInt();
                myL.setLongueur(number);
            } while (number < 0 || number > 20);

            System.out.println("Vous avez saisi : " + number);
        }
    }

