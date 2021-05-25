package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] splint = input.split(":");
        String drinkcod = splint[0];
        String sugarcod = splint[1];

        Cammand cammand = new Cammand();
        if (drinkcod.equals("T")){
            cammand.setDrinkType("TEA");
        } else if (drinkcod.equals("C")){
            cammand.setDrinkType("COFFE");
        } else if (drinkcod.equals("S")){
            cammand.setDrinkType("CHOCOLATE");
        }

        cammand.setSugarquartity(Integer.parseInt(sugarcod));


        CoffeMachin coffeMachin = new CoffeMachin();
        coffeMachin.makedrink(cammand);
        Cup cup = coffeMachin.makedrink(cammand);
        System.out.println(cup);
    }
}
