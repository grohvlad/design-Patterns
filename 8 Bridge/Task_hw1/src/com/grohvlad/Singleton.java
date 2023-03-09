package com.grohvlad;

import java.util.HashMap;
import java.util.Map;

public class Singleton {
    private Singleton(){}
    private static final Singleton singleton = new Singleton();

    public static Singleton getInstance() {
        return singleton;
    }

    public enum Beverage{ Tea, Coffee, Chocolate}
    private final Map<Beverage,Integer> beverageCost = new HashMap<>(){{
        put(Beverage.Tea, 10);
        put(Beverage.Coffee, 15);
        put(Beverage.Chocolate, 20);
    }};

    public enum Topping{ None, Milk, Rum, Canella}
    private final Map<Topping,Integer> toppingCost = new HashMap<>(){{
        put(Topping.None, 0);
        put(Topping.Rum, 25);
        put(Topping.Milk, 15);
        put(Topping.Canella, 5);
    }};

    public int getBeverageCost(Beverage beverage){
        return beverageCost.get(beverage);
    }
    public int getToppingCost(Topping topping){
        return toppingCost.get(topping);
    }
}
