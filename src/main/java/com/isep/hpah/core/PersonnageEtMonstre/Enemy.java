package com.isep.hpah.core.PersonnageEtMonstre;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.sql.SQLOutput;

@Data
@SuperBuilder
public class Enemy extends Caractere{

//    public Enemy(String name, int maxHP, int xp) {
//        super(name, maxHP, xp);
//    }
public static Enemy Troll(String name){

    Enemy Troll = Enemy.builder()
            .name(name)
            .hp(2000)
            .maxHp(2000)
            // .potion(listpotion)
            //.listattack

            .build();

    return Troll;
}
    public static int healthChangeEnemy (int hp,int degat){
        int hpLeft = hp -degat;
        if (hpLeft <0){
            System.out.println("The enemy is dead");
            return (0);

        }else {
            return (hpLeft);
        }

    }



    public static int xpChangeEnemy (int hp){
        return hp;
    }


    @Override
    public int attack() {
        return 0;
    }

    @Override
    public int defence() {
        return 0;
    }
}
