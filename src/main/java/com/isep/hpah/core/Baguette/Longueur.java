package com.isep.hpah.core.Baguette;

import java.util.Scanner;

public class Longueur {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int number;
            do {
                System.out.print("Veuillez saisir un nombre entre 0 et 20 : ");
                number = sc.nextInt();
            } while (number < 0 || number > 20);

            System.out.println("Vous avez saisi : " + number);
        }
    }

