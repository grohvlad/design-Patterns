package com.grohvlad.coffe;

public class Espresso implements Coffee {
    private final String name = "Espresso";
    @Override
    public String getName() {
        return name;
    }
}
