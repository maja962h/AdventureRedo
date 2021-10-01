package com.company;
import java.util.Locale;
import java.util.Scanner;

public class Adventure {
    Scanner input = new Scanner(System.in);
    Map map = new Map();
    Player player = new Player();
    Room room = new Room("","");
    Room startRoom;
    Room currentRoom;


    public Adventure(){
        startRoom = map.getstartRoom();
        currentRoom = startRoom;
    }

    public void gamePlay(){
        System.out.println("Welcome to burglar simulator 2K21! Today we are trying to break into yet another house.");
        System.out.println("There are 8 areas around the house, where you can look for items to aid you in your crimes.");
        System.out.println("To move between areas, type commands like these:" +
                "\nNorth: 'go north'\nSouth: 'go south'\nEast: 'go east'\nWest: 'go west'");
        System.out.println("Good luck, and don't get caught.\n");

        System.out.println(currentRoom);

        while (true) {
            String direction = input.next().trim().toLowerCase(Locale.ROOT);
            switch (direction) {
                case "north", "go north", "n":
                    if (currentRoom.getNorth() == null) {
                        System.out.println("You can't enter from this direction.");
                    } else {
                        currentRoom = currentRoom.getNorth();
                        System.out.println(currentRoom);
                    }
                    break;

                case "south", "go south", "s":
                    if (currentRoom.getSouth() == null) {
                        System.out.println("You can't enter from this direction.");
                    } else {
                        currentRoom = currentRoom.getSouth();
                        System.out.println(currentRoom);
                    }
                    break;

                case "west", "go west", "w":
                    if (currentRoom.getWest() == null) {
                        System.out.println("You can't enter from this direction.");
                    } else {
                        currentRoom = currentRoom.getWest();
                        System.out.println(currentRoom);
                    }
                    break;

                case "east", "go east", "e":
                    if (currentRoom.getEast() == null) {
                        System.out.println("You can't enter from this direction.");
                    } else {
                        currentRoom = currentRoom.getEast();
                        System.out.println(currentRoom);
                    }
                    break;

                case "look":
                    System.out.println(currentRoom);
                    room.getInventory();
                    break;

                case "help":
                    System.out.println("List of commands:\nNorth: 'go north'\nSouth: 'go south'\nEast: 'go east'" +
                            "\nWest: 'go west'\nTake item: 'take'\nDrop item: 'drop'\nCheck inventory: 'inventory'");
                    break;

                case "exit":
                    System.out.println("Thank you for robbing with us :)");
                    System.exit(0);
                    break;

                case "inventory":
                    player.getPlayerInventory();
                    break;

                case "take":
                    System.out.println("you picked up: ");
                    player.takeItem("");
                    break;

                case "drop":
                    System.out.println("You dropped: ");
                    player.dropItem("");
                    break;

                case "crawl":
                    System.out.println("The gutter was very loose, and you fell to your death.");
                    System.exit(0);
                    break;

                case "jump":
                    System.out.println("You could not jump high enough, idiot. Your leg is now broken. boohoo.");
                    System.exit(0);

                case "use":
                    System.out.println("");
                    break;

                case "give":
                    System.out.println("");
                    break;

                case "wear":
                    System.out.println("You are now cursed. Good luck with that.");
                    System.exit(0);
                    break;
                }


            }




        }




    }




