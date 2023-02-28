package com.grohvlad.coffe;

public class EspressoMaker implements CoffeeMachine {
    @Override
    public Coffee makeCoffee() {
        return new Espresso();
    }
}
