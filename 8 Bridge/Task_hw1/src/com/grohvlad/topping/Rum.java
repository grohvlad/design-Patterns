package com.grohvlad.topping;

import com.grohvlad.Singleton;

public class Rum extends ATopping{
    public Rum() {
        this.type = Singleton.Topping.Rum;
        this.cost = Singleton.getInstance().getToppingCost(type);
    }
}
