package com.isep.hpah.core.Apprendre;

import com.isep.hpah.core.Main;
import com.isep.hpah.core.PersonnageEtMonstre.Enemy;
import com.isep.hpah.core.PersonnageEtMonstre.Sorcier;
import com.isep.hpah.core.Spell;

import java.util.Scanner;

public class GameLogic {
    static Scanner scanner = new Scanner(System.in);

    public static void anythingToContinue(){
        System.out.println(" \nEnter 1 to continue");
        scanner.next();
    }

    public static void spaceBetweenText(){
        for (int i =0; i <1; i++ )
            System.out.println();
    }

    public static void printSeperator(int numberOfLine){
        for (int i =0; i <numberOfLine; i++ )
            System.out.println();
    }

    public static void clearConsole(){
        for (int i =0; i <100; i++ )
            System.out.println();
    }

    //method to print a heading
    public static void printHeading(String title) {
        printSeperator(30);
        System.out.println(title);
        printSeperator(30);
    }


        public static void battle(Enemy enemy,Sorcier sorcier ) {
            //main battle loop
            while (true) {
                Scanner scanner = new Scanner(System.in);
                clearConsole();
                System.out.println(enemy.getName() + "\nHP: " + enemy.getHp() + "/" + enemy.getMaxHp());
                System.out.println(sorcier.getName() + "\nHP: " + sorcier.getHp() + "/" + sorcier.getMaxHp());
                System.out.println("Choose an action:");
                int input = Sorcier.choixSorcier();

                //react accordingly to player input
                if (input == 1) {
                    //FIGHT
                    //calculate dmg and dmgTook (dmg enemy deals to player)
                    int dmg = sorcier.attack() - enemy.defence();
                    int dmgTook = enemy.attack() - sorcier.defence();
                    //check that dmg and dmgTook isn't negative
                    if (dmgTook < 0) {
                        //add some dmg if player defends very well
                        dmgTook = 0;
                    }
                    if (dmg < 0) {
                        //add some dmg if player defends very well
                        dmg = 0;
                    }
                    System.out.println("You dealt " + dmg + " damage to the " + enemy.getName() + ".");
                    enemy.setHp(Enemy.healthChangeEnemy(enemy.getHp(), dmg));
                    System.out.println("The " + enemy.getName() + " dealt " + dmgTook + " damage to you.");
                    anythingToContinue();
                    //check if player is still alive or dead
                    if (sorcier.getHp() <= 0) {
                        playerDied(); //method to end the game
                        break;
                    }
                    else if (enemy.getHp() <= 0) {
                        //tell the player he won
                        System.out.println("You defeated the " + enemy.getName() + "!");
                        //increase player xp
                        sorcier.setXp(sorcier.getXp() + 1);
                        //random drops
                        anythingToContinue();
                        break;
                    }

                else if (input == 2) {
                    Spell.allSpell(sorcier);
                    anythingToContinue();

                    }

                else if (input == 3) {
                        //USE POTION
                        clearConsole();
                        if (sorcier.getHp() < sorcier.getMaxHp()) {
                            //player CAN take a potion
                            //make sure player wants to drink the potion
                            printHeading("Do you want to drink a potion? ");
                            System.out.println("(1) Yes\n(2) No, maybe later");
                            input = scanner.nextInt();
                            if (input == 1) {
                                //player actually took it
                                sorcier.setHp(sorcier.getMaxHp());
                                clearConsole();
                                printHeading("You drank a magic potion. It restored your health back to " + sorcier.getMaxHp());
                                anythingToContinue();
                            }
                        }

//                else{
//                    //player CANNOT take a potion
//                    printHeading("You don't have any potions or you're at full health.");
//                    anythingToContinue();
//                }
//            }else{
//                //RUN AWAY
//                clearConsole();
//                //check that player isn't in last act (final boss battle)
//                if(act != 4){
//                    //chance of 35% to escape
//                    if(Math.random()*10 + 1 <= 3.5){
//                        printHeading("You ran away from the " + enemy.name + "!");
//                        anythingToContinue();
//                        break;
//                    }else{
//                        printHeading("You didn't manage to escape.");
//                        //calculate dmage the player takes
//                        int dmgTook = enemy.attack();
//                        System.out.println("In your hurry you took " + dmgTook + " damage!");
//                        anythingToContinue();
//                        //check if player's still alive
//                        if(player.hp <= 0)
//                            playerDied();
//                    }
                    } else {
                        System.out.println("YOU CANNOT ESCAPE THE EVIL EMPEROR!!!");
                        anythingToContinue();
                    }

                }
            }
        }


    public static void playerDied(){
        clearConsole();
        printHeading("You died...");
        System.out.println("Thank you for playing my game. I hope you enjoyed it :)");
        new Main();
    }



}
