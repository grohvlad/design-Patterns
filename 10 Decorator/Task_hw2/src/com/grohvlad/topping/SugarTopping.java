package com.grohvlad.topping;

import com.grohvlad.beverage.Component;

public class SugarTopping extends BaseDecorator {
    public SugarTopping(Component wrapper) {
        super(wrapper);
    }

    @Override
    public String description() {
        return super.description() + " + sugar";
    }

    @Override
    public float cost() {
        return super.cost() + 0.05f;
    }
}
