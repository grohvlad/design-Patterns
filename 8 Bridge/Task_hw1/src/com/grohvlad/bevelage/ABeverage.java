package com.grohvlad.bevelage;

import com.grohvlad.topping.*;
public abstract class ABeverage implements IBeverage {
    protected ITopping topping;
    protected int cost;
    public enum Beverages{ Tea, Coffee, Chocolate}
    protected Beverages beverage;

    @Override
    public void prepare() {
        System.out.println(this.beverage.name() + " with " + topping.getName() +" topping is prepared");
    }

    @Override
    public void drink() {
        System.out.println(this.beverage.name() + " with " + topping.getName() +" is very tasty");
    }

    @Override
    public int cost() {
        return this.cost + topping.getCost();
    }
    @Override
    public String getName(){
        return beverage.name();
    }
}
