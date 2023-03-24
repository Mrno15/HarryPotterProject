package com.isep.hpah.core.Apprendre;

import java.util.Scanner;

public class GameLogic {
    static Scanner scanner = new Scanner(System.in);

    public static int readInt(String prompt, int userChoices){
        int input;

        do{System.out.println(prompt);
            input = scanner.nextInt();
          //  try{
           //     input = Interger.paraseInt(scanner.next());

         //   }catch (Exception e){
          //      input= -1;
          //      System.out.println("Please enter an integer ! ");

           // }
        }while (input < 1 || input > userChoices);
        return input;
    }

    public static void anythingToContinue(){
        System.out.println(" \nEnter anything to continue..");
        scanner.next();
    }
}
