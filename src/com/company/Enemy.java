package com.company;

public class Enemy {

    private String name;
    private String desc;
    private int enemyHP;
    private Room currentRoom;

    public Enemy(String name, String desc, int enemyHP){
        this.name = name;
        this.desc = desc;
        this.enemyHP = enemyHP;
    }

    public void setCurrentRoom(Room currentRoom){
        this.currentRoom = currentRoom;
    }

    @Override
    public String toString() {
        return "Enemy in this area!\n" + name + " - " + desc + " (Enemy HP: " + enemyHP + ")";
    }

}
