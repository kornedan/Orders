package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Lista elementów:");
        Item p1 = new Item("Chleb", 1,3.5);
        System.out.println(p1);
        Item p2 = new Item("Cukier", 3,4);
        System.out.println(p2);
        Order z = new Order(20);
        z.addPositionInTheOrder(p1);
        z.addPositionInTheOrder(p2);
        System.out.println("\nLista zamówienia:");
        System.out.println(z);
    }
}
