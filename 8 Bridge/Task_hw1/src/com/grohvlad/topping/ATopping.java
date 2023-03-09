package com.grohvlad.topping;

import com.grohvlad.Singleton;

public abstract class ATopping implements ITopping {
    protected int cost;
    protected Singleton.Topping type;

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getName() {
        return type.name();
    }
}
