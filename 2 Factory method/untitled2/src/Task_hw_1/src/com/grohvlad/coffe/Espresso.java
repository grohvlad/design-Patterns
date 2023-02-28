package com.grohvlad.coffe;

public class Espresso implements Coffee {
    private final String name = "Espresso";
    private final int selfCost = 10;
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSelfCost() {
        return selfCost;
    }
}
