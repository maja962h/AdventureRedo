package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Adventure {
    private Scanner input = new Scanner(System.in);
    private Map map = new Map();
    private Player player = new Player();
    private Room startRoom;
    private Room currentRoom;


    public Adventure() {
        map.createMap();
        startRoom = map.getstartRoom();
        currentRoom = startRoom;
    }

    public void gamePlay() {
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
                        System.out.println(currentRoom.getInventory());
                        System.out.println(currentRoom.getEnemiesInRoom());
                    }
                    break;

                case "south", "go south", "s":
                    if (currentRoom.getSouth() == null) {
                        System.out.println("You can't enter from this direction.");
                    } else {
                        currentRoom = currentRoom.getSouth();
                        System.out.println(currentRoom);
                        System.out.println(currentRoom.getInventory());
                        System.out.println(currentRoom.getEnemiesInRoom());
                    }
                    break;

                case "west", "go west", "w":
                    if (currentRoom.getWest() == null) {
                        System.out.println("You can't enter from this direction.");
                    } else {
                        currentRoom = currentRoom.getWest();
                        System.out.println(currentRoom);
                        System.out.println(currentRoom.getInventory());
                        System.out.println(currentRoom.getEnemiesInRoom());
                    }
                    break;

                case "east", "go east", "e":
                    if (currentRoom.getEast() == null) {
                        System.out.println("You can't enter from this direction.");
                    } else {
                        currentRoom = currentRoom.getEast();
                        System.out.println(currentRoom);
                        System.out.println(currentRoom.getInventory());
                        System.out.println(currentRoom.getEnemiesInRoom());
                    }
                    break;

                case "look":
                    System.out.println(currentRoom);
                    System.out.println(currentRoom.getInventory());
                    break;

                case "help":
                    System.out.println("List of commands:\nNorth: 'go north'\nSouth: 'go south'\nEast: 'go east'" +
                            "\nWest: 'go west'\nTo take items, type: 'take', and then type item letter.\nTo Drop items, " +
                            "type: 'drop', and then type item letter.\nCheck inventory: 'inventory'");
                    break;

                case "exit":
                    System.out.println("Thank you for robbing with us :)");
                    System.exit(0);
                    break;

                case "inventory":
                    player.getPlayerInventory();
                    break;

                case "take":
                    String itemToPickUp = input.next();
                    player.takeItem(currentRoom, itemToPickUp);
                    break;

                case "drop":
                    String itemToDrop = input.next();
                    player.dropItem(currentRoom, itemToDrop);
                    break;

                case "crawl":
                    System.out.println("The gutter was very loose, and you fell down.");
                    player.takDamage(30);
                    System.out.println("\nYou lost 30 HP");
                    System.out.println("Health status: " + player.getStartHP() + " " + player.showPlayerHP());
                    break;

                case "jump":
                    System.out.println("You could not jump high enough, idiot. Your leg is now broken. boohoo.");
                    player.takDamage(50);
                    System.out.println("\nYou lost 50 HP");
                    System.out.println("Health status: " + player.getStartHP() + " " + player.showPlayerHP());
                    break;


                case "wear":
                    System.out.println("You are now cursed. Good luck with that.");
                    System.exit(0);
                    break;

                case "health":
                    System.out.println("Current HP: ");
                    System.out.println(player.showPlayerHP());
                    break;

                case "eat":
                    String foodToEat = input.next();
                    Status status = player.eat(foodToEat);
                    switch (status) {
                        case NOTFOUND -> System.out.println("There is no " + foodToEat + ".");
                        case CANT -> System.out.println("You cannot eat " + foodToEat + ".");
                        case OKAY -> System.out.println("Yout have eaten " + foodToEat + ". Current HP " +
                                player.showPlayerHP() + ".");
                    }
                    break;

                case "equip":
                    String toEquip = input.next();
                    Status status2 = player.equip(toEquip);
                    switch (status2) {
                        case NOTFOUND -> System.out.println("There is no " + toEquip + ".");
                        case CANT -> System.out.println("You cannot equip " + toEquip + ".");
                        case OKAY -> System.out.println("Yout have equipped " + toEquip + ".");
                    }
                    break;

                /*case "attack":
                    String toAttack = input.next();
                    Status status1;*/
            }


        }


    }


    /*public void getPlayerHP() {
        int playerHP = 0;
        int maxHP = 100;

        if(playerHP == maxHP){
            System.out.println(playerHP + " - Full health.");
        } else if (playerHP < maxHP && playerHP >= 70){
            System.out.println(playerHP + " - Still standing strong.");
        } else if (playerHP < 70 && playerHP >= 50){
            System.out.println(playerHP + " - Be extra careful around enemies.");
        } else if (playerHP < 50 && playerHP >= 25){
            System.out.println(playerHP + " - You should consider getting sustenance.");
        } else if (playerHP < 25 && playerHP > 0){
            System.out.println(playerHP + " - You're not quite dead yet.");
        } else if (playerHP <= 0){
            System.out.println(playerHP + " - You're pretty dead, idk what to tell ya.");
        }
    }*/


}




