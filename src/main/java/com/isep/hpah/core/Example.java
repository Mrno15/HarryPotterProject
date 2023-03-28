package com.isep.hpah.core;

import com.isep.hpah.core.Apprendre.GameLogic;
import com.isep.hpah.core.PersonnageEtMonstre.Enemy;
import com.isep.hpah.core.PersonnageEtMonstre.Sorcier;
import lombok.Data;

@Data
public class Example {
    public static void main(String[] args) {
            //Enemy troll = Enemy.createTroll("Troll");

            //troll.setHp(Enemy.healthChangeEnemy(troll.getHp(), 2000));

            //System.out.println(troll.getHp());


        Sorcier.choixSorcier();
        GameLogic.anythingToContinue();
    }
}