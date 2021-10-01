package com.company;

public class Map {


    private Room startRoom;
    Item i = new Item("","");
    Room r = new Room("","");

    public Map(){
        Room room1 = new Room("Shed behind the house", "The shed is empty. The tools might be elsewhere.");

        Room room2 = new Room("Flower beds", "The flowers are in full bloom, they must be well take care of.");
        /*if (r.inventory.contains("gloves")){
                room2 = new Room("Flower beds", "The flowers are in full bloom, they must be well take care of. " +
                "There is a pair of gloves laying between the flowers.\nWould be a good way to hide your fingerprints.");
        } else {
                room2 = new Room("Flower beds", "The flowers are in full bloom, they must be well take care of. ");
        }*/

        Room room3 = new Room("Sandbox", "The sand it soaked from the rain.");

        Room room4 = new Room("Left side of house", "The gutter going up to the roof is on this side. You can attempt to crawl it. \nWhat to type: 'crawl'");

        Room room5 = new Room("Inside of the house", "You got inside, and found a mysterious necklace.\nType 'wear' to pick it up");

        Room room6 = new Room("Trampoline", "There is a trampoline next to the house, and an open window on the first floor. " +
                "You can attempt to jump up and enter the house this way.\nWhat to type: 'jump'");

        Room room7 = new Room("Driveway", "\nWARNING: you are visible from the street. Don't stay for too long.");
        /*if (r.inventory.contains("squeaky toy")){
            room7 = new Room("Driveway", "You find a squeaky toy in the gravel.\nWARNING: you are visible from the street. " +
                    "Don't stay for too long.");
        } else {
            room7 = new Room("Driveway", "There is no car parked in the driveway.\nWARNING: you are visible from the street. " +
                    "Don't stay for too long.");
        }*/

        Room room8 = new Room("Front door", "Try to get in.\nWARNING: you are visible from the street. Don't stay for too long.");

        Room room9 = new Room("Dog house", "\nWARNING: you are visible from the street. Don't stay for too long.");
        /*if(r.inventory.contains("key")){
            room9 = new Room("Dog house", "There is a shiny object inside.\nWARNING: " +
                "you are visible from the street. Don't stay for too long.");
        } else {
            room9 = new Room("Dog House", "The dog house is empty.\nWARNING: you are visible from the street. Don't stay for too long.");
        }*/

        // TODO: dog house has the spare key.
        // TODO: player will have two options to pick in the house. could be curse or could be gold.

        room1.setSouth(room4);
        room1.setEast(room2);
        room2.setEast(room3);
        room2.setWest(room1);
        room2.addItemsToRoom(new Item("gloves", "g"));
        room3.setSouth(room6);
        room3.setWest(room2);
        room4.setNorth(room1);
        room4.setSouth(room7);
        room5.setSouth(room8);
        room6.setNorth(room3);
        room6.setSouth(room9);
        room7.setNorth(room4);
        room7.setEast(room8);
        room7.addItemsToRoom(new Item("squeaky toy", "st"));
        room8.setNorth(room5);
        room8.setEast(room9);
        room8.setWest(room7);
        room9.setNorth(room6);
        room9.setWest(room8);
        room9.addItemsToRoom(new Item("key", "k"));

        startRoom = room1;

    }

    public Room getstartRoom() {
        return startRoom;
    }
}
