package com.company;

public class CoffeMachin {
    public Cup  makedrink(Cammand cammand){
        Cup cup = new Cup();
        if (cammand.getDrinkType().equals("TEA")){
            Tea tea = new Tea();
            cup.setDrink(tea);
        } else if (cammand.getDrinkType().equals("COFFE")){
            Coffee coffee = new Coffee();
            cup.setDrink(coffee);
        } else if (cammand.getDrinkType().equals("CHOCOLATE")){
            Chocolate chocolate = new Chocolate();
            cup.setDrink(chocolate);
        }
        if (cammand.getSugarquartity()>0){
            Stick stick = new Stick();
            cup.setStick(stick);
        }
        if (cammand.getSugarquartity()>0){
            Shuger[] shugers = new Shuger[cammand.getSugarquartity()];
            for (int i = 0; i < shugers.length; i++) {
                Shuger shuger = new Shuger();
                shugers[i]=shuger;
            }
            cup.setShugars(shugers);
        }
        return cup;
    }
}
