package com.grohvlad.coffe;

public class Cappuccino implements Coffee {
    private final String name = "Cappuccino";
    private final int selfCost = 20;
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSelfCost() {
        return selfCost;
    }
}
