package com.company;

public class Food extends Item {

    private int hpOfFood;

    public Food(String itemLongName, String itemShortName,int hpOfFood) {
        super(itemLongName, itemShortName);
        this.hpOfFood = hpOfFood;

    }

    public int getHpOfFood() {
        return hpOfFood;
    }

}

