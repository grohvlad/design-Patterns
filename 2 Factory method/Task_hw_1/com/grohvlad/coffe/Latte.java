package com.grohvlad.coffe;

public class Latte implements Coffee {
    private final String name = "Latte";
    @Override
    public String getName() {
        return name;
    }
}
