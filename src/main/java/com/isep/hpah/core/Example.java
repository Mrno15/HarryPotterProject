package com.isep.hpah.core;

import com.isep.hpah.core.Apprendre.GameLogic;
import com.isep.hpah.core.PersonnageEtMonstre.Enemy;
import com.isep.hpah.core.PersonnageEtMonstre.Sorcier;
import lombok.Data;

import java.util.Scanner;

@Data
public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Choose a name");
        String nom = scanner.nextLine();

        Sorcier sorcier = Sorcier.createSorcier(nom);

        Enemy troll = Enemy.createTroll("Troll");

        GameLogic.battle(troll, sorcier);




    }
}