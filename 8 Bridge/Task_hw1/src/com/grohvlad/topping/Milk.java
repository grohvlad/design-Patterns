package com.grohvlad.topping;

import com.grohvlad.Singleton;

public class Milk extends ATopping {
    public Milk(){
        this.type = Toppings.Milk;
        this.cost = Singleton.getInstance().getToppingCost(type);
    }
}
