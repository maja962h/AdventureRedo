package com.company;

public class Item {

    private String itemLongName;
    private String itemShortName;
    //public String itemDescription;

    public Item(String itemLongName, String itemShortName){
        this.itemLongName = itemLongName;
        this.itemShortName = itemShortName;
    }

    public String getItemLongName() {
        return itemLongName;
    }

    public void setItemLongName(String itemName) {
        this.itemLongName = itemName;
    }

    public String getItemShortName() {
        return itemShortName;
    }

    public void setItemShortName(String itemShortName) {
        this.itemShortName = itemShortName;
    }

    @Override
    public String toString() {
        return "Item: " + itemLongName+ " (" + itemShortName + ")";
    }
}
