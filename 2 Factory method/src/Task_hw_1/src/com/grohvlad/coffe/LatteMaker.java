package com.grohvlad.coffe;

public class LatteMaker implements CoffeeMachine {
    @Override
    public Coffee makeCoffee() {
        return new Espresso();
    }
}
