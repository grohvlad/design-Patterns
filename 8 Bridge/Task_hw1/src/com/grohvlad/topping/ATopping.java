package com.grohvlad.topping;

public abstract class ATopping implements ITopping {
    protected int cost;

    public enum Toppings{ None, Milk, Rum, Canella}
    protected Toppings type;

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getName() {
        return type.name();
    }
}
