package com.grohvlad.topping;

import com.grohvlad.Singleton;

public class NoTopping extends ATopping {
    public NoTopping() {
        this.type = Singleton.Topping.None;
        this.cost = Singleton.getInstance().getToppingCost(type);
    }
}
