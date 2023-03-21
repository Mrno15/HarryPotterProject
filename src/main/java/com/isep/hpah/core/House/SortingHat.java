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
        Sorcier myHouse = new Sorcier();
        myHouse.getHouse();

        List<String> list = new ArrayList<String>();
        list.add("Griffondor");
        list.add("Poussoufle");
        list.add("Serpentard");
        list.add("Serdaigle");
        System.out.println(list);

        Random rand = new Random();
        myHouse.setHouse( list.get(rand.nextInt(list.size())));
        System.out.println("L'élément sélectionné au hasard est : " + myHouse.getHouse());

    }

}
