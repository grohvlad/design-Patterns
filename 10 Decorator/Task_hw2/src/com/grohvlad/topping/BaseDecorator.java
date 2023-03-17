package com.grohvlad.topping;

import com.grohvlad.beverage.Component;

public abstract class BaseDecorator implements Component {
    protected Component wrapper;

    public BaseDecorator(Component wrapper){
        this.wrapper = wrapper;
    }

    @Override
    public String description() {
        return wrapper.description();
    }

    @Override
    public float cost() {
        return wrapper.cost();
    }

    public String toString(){
        return "Beverage: " + description() + ", $" + cost();
    }
}
