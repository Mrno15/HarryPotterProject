package com.isep.hpah.core.PersonnageEtMonstre;

import lombok.Data;
import lombok.experimental.SuperBuilder;

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

    public int attack() {
        return 50;
    }

    public int defence() {
        return 0;
    }


    public static int healthChangeEnemy (int hp){
        return hp;
    }

    public static int xpChangeEnemy (int hp){
        return hp;
    }



}
