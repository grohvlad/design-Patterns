package com.grohvlad.topping;

import com.grohvlad.beverage.Component;

public class CreamTopping extends BaseDecorator {
    public CreamTopping(Component wrapper) {
        super(wrapper);
    }

    @Override
    public String description() {
        return super.description() + " + cream";
    }

    @Override
    public float cost() {
        return super.cost() + 0.5f;
    }
}
