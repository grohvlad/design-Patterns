package com.grohvlad.topping;

import com.grohvlad.Singleton;

public class Canella extends ATopping{
    public Canella() {
        this.type = Toppings.Canella;
        this.cost = Singleton.getInstance().getToppingCost(type);
    }
}
