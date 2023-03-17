package com.grohvlad.topping;

import com.grohvlad.beverage.*;

public class CaramelTopping extends BaseDecorator {
    public CaramelTopping(Component wrapper) {
        super(wrapper);
    }

    @Override
    public String description() {
        return super.description() + " + caramel";
    }

    @Override
    public float cost() {
        return super.cost() + 0.6f;
    }
}
