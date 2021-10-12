package com.company;

import java.util.ArrayList;

public class Player {

            private Map map = new Map();
            //private Room currentRoom;
            private ArrayList<Item> playerInventory = new ArrayList<>();
            private int playerHP, maxHP, startHP;

            public Player() {
                //this.currentRoom = map.getstartRoom();
                this.maxHP = 100;
                this.startHP = maxHP;
            }


            // Shows if there are items in the player's inventory or not.
            public void getPlayerInventory() {
                if (playerInventory.isEmpty()) {
                    System.out.println("Your inventory is empty.");
                } else {
                    for (int i = 0; i < playerInventory.size(); i++) ;
                    System.out.println(playerInventory);
                }
            }

            public void setPlayerInventory(ArrayList<Item> playerInventory) {
                this.playerInventory = playerInventory;
            }


            public Item takeItem(Room playerRoom, String itemName) {
                for (Item item : playerRoom.inventory) {
                    if (item.getItemShortName().equalsIgnoreCase(itemName)) {
                        playerInventory.add(item);
                        playerRoom.removeItemFromRoom(item);
                        System.out.println("You've picked up: " + item.getItemLongName());
                        return item;
                    }
                }
                return null;
            }

            public Item dropItem(Room playerRoom, String itemName) {
                for (Item item : playerInventory) {
                    if (item.getItemShortName().equalsIgnoreCase(itemName)) {
                        playerRoom.addItems(item);
                        playerInventory.remove(item);
                        System.out.println("You dropped: " + item.getItemLongName());
                        return item;
                    }
                }
                return null;
            }


            public int getPlayerHP() {
                return playerHP;
            }


            public String showPlayerHP() {
                    playerHP = startHP;
                    String hpStatus = "";
                    if (playerHP == maxHP) {
                        hpStatus = "Full health.";
                    } else if (playerHP < maxHP && playerHP >= 70) {
                        hpStatus = "Still standing strong.";
                    } else if (playerHP < 70 && playerHP >= 50) {
                        hpStatus = "Be extra careful around enemies.";
                    } else if (playerHP < 50 && playerHP >= 25) {
                        hpStatus = "You should consider getting sustenance.";
                    } else if (playerHP < 25 && playerHP > 0) {
                        hpStatus = "You're not quite dead yet.";
                    } else if (playerHP <= 0) {
                        hpStatus = "You're pretty dead, idk what to tell ya.";
                        System.exit(0);
                    }
                    return hpStatus;
            }

            public void takDamage(int damage){ //TODO: take damage does not work.
                startHP -= damage;
            }


            public Status eat(String item) {
                Status status = null;

                if (findItem(playerInventory,item) == null){
                    status = Status.NOTFOUND;
                }
                else if (!(findItem(playerInventory,item) instanceof Food)){
                    status = Status.CANT;
                }
                else status = Status.OKAY;

                /*if (findItem(playerInventory,item) == null) {
                    playerInventory.remove(item);
                }*/
                return status;
            }


            public Item findItem(ArrayList<Item> liste, String itemName){
                for (int i = 0; i < liste.size(); i++) {
                    Item item = liste.get(i);
                    if (itemName.equals(item.getItemLongName())) {
                        return item;
                    }
                }
                return null;
            }


    }

