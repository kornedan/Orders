package com.company;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Item> listOreder = new ArrayList<>();
    private int numberItemInTheOrder;

    public Order(int numberItemInTheOrder) {
        this.numberItemInTheOrder = numberItemInTheOrder;
    }

     void addPositionInTheOrder(Item item){
        listOreder.add(item);
    }

    double calculateOrder (){
        double jointResult = 0;
        for (Item item: listOreder) {
            jointResult += item.calculateValue();
        }
        return jointResult;
    }

    public String toString() {
        for (Item item: listOreder) {
            System.out.println(item);
        }
        return "Razem: "+calculateOrder()+" zł";
    }
}
