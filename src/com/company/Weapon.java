package com.company;

public class Weapon extends Item {

    private  int damagePoints;

    public Weapon(String itemLongName, String itemShortName, int damagePoints) {
        super(itemLongName, itemShortName);
        this.damagePoints = damagePoints;
    }

    public int getDamagePoints() {
        return damagePoints;
    }
}
