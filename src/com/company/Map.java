package com.company;

public class Map {

    public Room currentRoom;
    private Room startRoom;

    public Map(int firstRoom){
        Room room1 = new Room("Shed behind the house", "The shed is empty. The tools might be elsewhere.");
        Room room2 = new Room("Flower beds", "The flowers are in full bloom, they must be well take care of. " +
                "There is a pair of gloves laying between the flowers.");
        Room room3 = new Room("Sandbox", "There looks to be a tool sticking out of the sand. Looks to be a plastic shovel.");
        Room room4 = new Room("Left side of house", "The gutter going up to the roof is on this side. You can attempt to crawl it.");
        Room room5 = new Room("Inside of the house", "You got inside, and found a mysterious necklace, and you are now cursed. Good luck with that.");
        Room room6 = new Room("Trampoline", "There is a trampoline next to the house, and an open window on the first floor. " +
                "You can attempt to jump up and enter the house this way.");
        Room room7 = new Room("Driveway", "You find a squeaky toy in the gravel.\nWARNING: you are visible from the street. " +
                "Don't stay for too long.");
        Room room8 = new Room("Front door", "Try to get in.\nWARNING: you are visible from the street. Don't stay for too long.");
        Room room9 = new Room("Dog house", "Try to look inside, and see of you can find something.\nWARNING: " +
                "you are visible from the street. Don't stay for too long.");
        // TODO: dog house has the spare key.
        // TODO: if player crawls up the gutter, game ends.
        // TODO: if player jumps on trampoline, game ends.
        // TODO: player will have two options to pick in the house. could be curse or could be gold.

        room1.setSouth(room4);
        room1.setEast(room2);
        room2.setEast(room3);
        room2.setWest(room1);
        room3.setSouth(room6);
        room3.setWest(room2);
        room4.setNorth(room1);
        room4.setSouth(room7);
        room5.setSouth(room8);
        room6.setNorth(room3);
        room6.setSouth(room9);
        room7.setNorth(room4);
        room7.setEast(room8);
        room8.setNorth(room5);
        room8.setEast(room9);
        room8.setWest(room7);
        room9.setNorth(room6);
        room9.setWest(room8);

        if (firstRoom == 1){
            this.startRoom = room1;
            currentRoom = room1;
        }

    }

}
