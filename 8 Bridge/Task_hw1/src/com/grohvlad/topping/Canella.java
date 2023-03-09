package com.grohvlad.topping;

import com.grohvlad.Singleton;

public class Canella extends ATopping{
    public Canella() {
        this.type = Singleton.Topping.Canella;
        this.cost = Singleton.getInstance().getToppingCost(type);
    }
}
