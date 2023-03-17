package com.grohvlad.beverage;
public abstract class Beverage implements Component {
    @Override
    public abstract String description();

    @Override
    public abstract float cost();

    @Override
    public String toString() {
        return "Beverage: " + description() + ", $" + cost();
    }
}
