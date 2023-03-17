package com.grohvlad.topping;

import com.grohvlad.beverage.Component;

public class MilkTopping extends BaseDecorator {
    public MilkTopping(Component wrapper) {
        super(wrapper);
    }

    @Override
    public String description() {
        return super.description() + " + milk";
    }

    @Override
    public float cost() {
        return super.cost() + 0.25f;
    }
}
