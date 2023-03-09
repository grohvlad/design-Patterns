package com.grohvlad.topping;

import com.grohvlad.Singleton;

public class Rum extends ATopping{
    public Rum() {
        this.type = Toppings.Rum;
        this.cost = Singleton.getInstance().getToppingCost(type);
    }
}
