package com.isep.hpah.core.House;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.isep.hpah.core.PersonnageEtMonstre.Sorcier;



import lombok.*;

@Getter
@Setter
public class SortingHat {



    public static House getHouse()
    {
        House myHouse = new House();

        List<String> list = new ArrayList<String>();
        list.add("Griffondor");
        list.add("Poussoufle");
        list.add("Serpentard");
        list.add("Serdaigle");
        System.out.println(list);

        Random rand = new Random();
        String setmyHouse = (list.get(rand.nextInt(list.size())));
        System.out.println("L'élément sélectionné au hasard est : " + myHouse);
        House.sethouse;
        val House = House.gethouse;

        return myHouse;
    }

}
