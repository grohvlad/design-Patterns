package com.grohvlad.coffe;

public class Americano implements Coffee {
    private final String name = "Americano";
    private final int selfCost = 15;
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSelfCost() {
        return selfCost;
    }
}
