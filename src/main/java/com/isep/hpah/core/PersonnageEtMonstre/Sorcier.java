package com.isep.hpah.core.PersonnageEtMonstre;

import com.isep.hpah.core.House.Pet;
import com.isep.hpah.core.Baguette.Core;
import com.isep.hpah.core.House.House;

import com.isep.hpah.core.Spell;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Scanner;

import static com.isep.hpah.core.Spell.Wirgardium_Leviosa;

@Getter
@Data
@SuperBuilder
public class Sorcier extends Caractere {


    private House house;

    private Pet pet;

    private Core core;

    // mettre attack bonus, defbonus, augamenteation pussance sort pour les effets des maisons

    public static String nomInt() {
        Scanner sc = new Scanner(System.in);
        String Name;
        System.out.print("Quelle nom souhaitez vous donner a votre personnage");
        Name = sc.nextLine();
        System.out.println("Vous avez saisi : " + Name);
        return (Name);

    }
    public static Sorcier createSorcier(String name){
        Sorcier sorcier = Sorcier.builder()
                .name(name)
                .hp(100)
                .maxHp(200)
               // .potion(listpotion)
                .xp(0)
                .potion(50)
                .precision(70)

                .build();

        return sorcier;
    }

    public static void playerOptions(){
        System.out.println(" 1. Attack ");
        System.out.println(" 2. Spell ");
        System.out.println(" 3. Potion ");
        System.out.println(" 4. Defence ");
    }



    public static String[]  ChoixSorcier = { "Attack", "Spell", "Potion", "Defence"};

    public static int choixSorcier(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose one of the following options");
            playerOptions();
            int core = scanner.nextInt();
            switch (core) {
                case 1:
                    System.out.println("You choose to Attack");
                    return 1;
                case 2:
                    System.out.println("You choose a Spell");
                    return 2;
                case 3:
                    System.out.println("You choose a Potion");
                    return 3;
                case 4:
                    System.out.println("You choose to Defence");
                    return 4;
                default:
                    System.out.println("Option invalide");
                    break;
                }
            }
        }











    public int attackSpell(Enemy enemy, Spell spell) {
        if ((enemy.equals("troll") && spell.equals(Wirgardium_Leviosa)) {
            return 200;
        }
        return 50;
    }

    @Override
    public int attack() {
        return 50;
    }

    public int defence() {
        return 20;
    }

    public static int healthChangeSorcier (int hp){
        return hp;
    }

    public static int xpChangeSorcier (int hp){
        return hp;
    }

    public static int bonusHealthChangeSorcier (int hp){
        return hp;
    }

    public static int bonusHpChangeSorcier (int hp){
        return hp;
    }
}

