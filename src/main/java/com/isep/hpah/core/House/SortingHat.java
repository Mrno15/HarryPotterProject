package com.isep.hpah.core.House;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.isep.hpah.core.Sorcier;
import lombok.*;

@Getter
@Setter
public class SortingHat {

    public static void main(String[] args)
    {
        String myHouse;


        List<String> list = new ArrayList<String>();
        list.add("Griffondor");
        list.add("Poussoufle");
        list.add("Serpentard");
        list.add("Serdaigle");
        System.out.println(list);

        Random rand = new Random();
        myHouse = ( list.get(rand.nextInt(list.size())));
        System.out.println("L'élément sélectionné au hasard est : " + myHouse);

    }

}
