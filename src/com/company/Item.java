package com.company;

public class Item {

    public String itemLongName;
    public String itemShortName;

    public Item(String itemLongName, String itemShortName){
        this.itemLongName = itemLongName;
        this.itemShortName = itemShortName;

    }

    public String getItemLongNameName() {
        return itemLongName;
    }

    public void setItemLongNameName(String itemName) {
        this.itemLongName = itemName;
    }

    public String getItemShortName() {
        return itemShortName;
    }

    public void setItemShortName(String itemShortName) {
        this.itemShortName = itemShortName;
    }
}
