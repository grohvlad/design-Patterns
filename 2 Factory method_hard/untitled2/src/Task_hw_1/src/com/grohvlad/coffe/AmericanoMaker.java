package com.grohvlad.coffe;

public class AmericanoMaker implements CoffeeMachine {
    @Override
    public Coffee makeCoffee() {
        return new Americano();
    }
}
