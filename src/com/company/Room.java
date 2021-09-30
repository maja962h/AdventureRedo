package com.company;

import java.util.ArrayList;

public class Room {

    private String name;
    private String description;

    private Room north;
    private Room south;
    private Room east;
    private Room west;

    public ArrayList<Item> inventory = new ArrayList<>();

    public Room(String name, String description){
        this.name = name;
        this.description = description;

    }


    public Room getNorth() {
        return north;
    }

    public void setNorth(Room north) {
        this.north = north;
    }

    public Room getSouth() {
        return south;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    public Room getEast() {
        return east;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public Room getWest() {
        return west;
    }

    public void setWest(Room west) {
        this.west = west;
    }

    public void addItemsToRoom(Item item){
        inventory.add(item);
    }

    @Override
    public String toString() {
        return name + "\n" + description;
    }
}
