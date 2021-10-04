package com.company;

import java.util.ArrayList;

public class Player{

    Map map = new Map();
    private Room currentRoom;
    private ArrayList<Item> playerInventory = new ArrayList<>();

    public Player(){
        this.currentRoom = map.getstartRoom();
    }



    public Room getCurrentRoom() {
        return currentRoom;
    }

    // Shows if there are items in the player's inventory or not.
    public void getPlayerInventory() {
        if(playerInventory.isEmpty()){
            System.out.println("Your inventory is empty.");
        } else {
            for (int i = 0; i < playerInventory.size(); i++);
            System.out.println(playerInventory);
        }
    }

    public void setPlayerInventory(ArrayList<Item> playerInventory) {
        this.playerInventory = playerInventory;
    }


    public Item takeItem(Room playerRoom, String itemName){
        for(Item item : playerRoom.inventory) {
            if(item.getItemLongName().equalsIgnoreCase(itemName)){
                playerInventory.add(item);
                playerRoom.removeItemFromRoom(item);
                System.out.println("You've picked up: " + item.getItemLongName());
                return item;
            }
        }
        return null;
    }

    public Item dropItem(Room playerRoom, String itemName){
        for (Item item : playerInventory){
            if (item.getItemLongName().equalsIgnoreCase(itemName)){
                playerRoom.addItems(item);
                playerInventory.remove(item);
                System.out.println("You dropped: " + item.getItemLongName());
                return item;
            }
        }
        return null;
    }


}
