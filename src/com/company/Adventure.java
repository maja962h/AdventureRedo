package com.company;
import java.util.Locale;
import java.util.Scanner;

public class Adventure {
    Scanner input = new Scanner(System.in);
    Map m = new Map(1);

    public Adventure(){

    }

    public void gamePlay(){
        System.out.println("Welcome to burglar simulator 2K21! Today we are trying to break into yet another house.");
        System.out.println("There are 8 areas around the house, where you can look for items to aid you in your crimes.");
        System.out.println("To move between areas, type commands like these:" +
                "\nNorth: 'go north'\nSouth: 'go south'\nEast: 'go east'\nWest: 'go west'");
        System.out.println("Good luck, and don't get caught.\n");

        System.out.println(m.currentRoom);

        while (true) {
            String direction = input.next().trim().toLowerCase(Locale.ROOT);
            switch (direction) {
                case "north", "go north", "n":
                    if (m.currentRoom.getNorth() == null) {
                        System.out.println("You can't enter from this direction.");
                    } else {
                        m.currentRoom = m.currentRoom.getNorth();
                        System.out.println(m.currentRoom);
                    }
                    break;

                case "south", "go south", "s":
                    if (m.currentRoom.getSouth() == null) {
                        System.out.println("You can't enter from this direction.");
                    } else {
                        m.currentRoom = m.currentRoom.getSouth();
                        System.out.println(m.currentRoom);
                    }
                    break;

                case "west", "go west", "w":
                    if (m.currentRoom.getWest() == null) {
                        System.out.println("You can't enter from this direction.");
                    } else {
                        m.currentRoom = m.currentRoom.getWest();
                        System.out.println(m.currentRoom);
                    }
                    break;

                case "east", "go east", "e":
                    if (m.currentRoom.getEast() == null) {
                        System.out.println("You can't enter from this direction.");
                    } else {
                        m.currentRoom = m.currentRoom.getEast();
                        System.out.println(m.currentRoom);
                    }
                    break;

                case "look":
                    System.out.println(m.currentRoom);
                    break;

                case "help":
                    System.out.println("List of commands:\nNorth: 'go north'\nSouth: 'go south'\nEast: 'go east'\nWest: 'go west'");
                    break;

                case "exit":
                    System.out.println("Thank you for robbing with us :)");
                    System.exit(0);
                    break;
                }
            }



        }

    }




