package com.company;

public class Room {

    private String name;
    private String description;

    private Room north;
    private Room south;
    private Room east;
    private Room west;

    public Room(String name, String description){
        this.name = name;
        this.description = description;

        this.north = north;
        this.south = south;
        this.west = west;
        this.east = east;
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

    @Override
    public String toString() {
        return name + "\n" + description;
    }
}
