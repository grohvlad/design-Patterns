package com.grohvlad.coffe;

public class Latte implements Coffee {
    private final String name = "Latte";
    private final int selfCost = 30;
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSelfCost() {
        return selfCost;
    }
}
