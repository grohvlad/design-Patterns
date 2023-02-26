package com.grohvlad.transport;

public abstract class Trolleybus {

    public Trolleybus(int cost, int usageCost) {
        this.cost = cost;
        this.usageCost = usageCost;
    }

    public int getCost() {
        return cost;
    }

    public int getUsageCost() {
        return usageCost;
    }

    public void goByContactNetwork() {
        System.out.println("com.grohvlad.transport.Trolleybus runs");
    }

    protected int cost;       // Вартість одиниці транспорту
    protected int usageCost;  //  Вартість експлуатації = вартість одного кілометру пробігу

}