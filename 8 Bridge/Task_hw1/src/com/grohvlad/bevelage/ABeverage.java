package com.grohvlad.bevelage;

import com.grohvlad.topping.*;
import com.grohvlad.Singleton;
public abstract class ABeverage implements IBeverage {
    protected ITopping topping;
    protected int cost;
    protected Singleton.Beverage beverage;

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
}
