package com.grohvlad.transport;


public abstract class Bus {

    public Bus(int cost, int usageCost) {
        this.cost = cost;
        this.usageCost = usageCost;
    }

    public int getCost() {
        return cost;
    }

    public int getUsageCost() {
        return usageCost;
    }

    public void goByWay() {
        System.out.println("com.grohvlad.transport.Bus runs!");
    }

    protected int cost;       // Вартість одиниці транспорту
    protected int usageCost;  //  Вартість експлуатації = вартість одного кілометру пробігу

}