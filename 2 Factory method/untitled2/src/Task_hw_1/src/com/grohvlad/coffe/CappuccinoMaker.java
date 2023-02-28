package com.grohvlad.coffe;

public class CappuccinoMaker implements CoffeeMachine {
    @Override
    public Coffee makeCoffee() {
        return new Cappuccino();
    }
}
