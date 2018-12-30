package com.company;

public class Item {

    private String itemName;
    private int howMany;
    private double price;

    public Item(String itemName, int howMany, double price) {
        this.itemName = itemName;
        this.howMany = howMany;
        this.price = price;
    }

    double calculateValue (){
       return this.howMany * this.price;
    }

    public String toString(){
        return itemName+" "+(double)price+" zł "+howMany+" szt. "+calculateValue()+" zł";
    }
}
