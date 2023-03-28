package com.isep.hpah.core.House;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.isep.hpah.core.PersonnageEtMonstre.Sorcier;



import lombok.*;

@Data
public class SortingHat {
    public static House getHouse() {
        House house = House.chooseHouse();
        System.out.println("L'élément sélectionné au hasard est : " + house);
  //      Sorcier.setHouse(House);
        return house;
    }

}
