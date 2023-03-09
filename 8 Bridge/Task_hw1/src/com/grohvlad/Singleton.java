package com.grohvlad;

import java.util.HashMap;
import java.util.Map;
import com.grohvlad.bevelage.ABeverage;
import com.grohvlad.topping.ATopping;

public class Singleton {
    private Singleton(){}
    private static final Singleton singleton = new Singleton();

    public static Singleton getInstance() {
        return singleton;
    }

    private final Map<ABeverage.Beverages,Integer> beverageCost = new HashMap<>(){{
        put(ABeverage.Beverages.Tea, 10);
        put(ABeverage.Beverages.Coffee, 15);
        put(ABeverage.Beverages.Chocolate, 20);
    }};


    private final Map<ATopping.Toppings,Integer> toppingCost = new HashMap<>(){{
        put(ATopping.Toppings.None, 0);
        put(ATopping.Toppings.Rum, 25);
        put(ATopping.Toppings.Milk, 15);
        put(ATopping.Toppings.Canella, 5);
    }};

    public int getBeverageCost(ABeverage.Beverages beverage){
        return beverageCost.get(beverage);
    }
    public int getToppingCost(ATopping.Toppings topping){
        return toppingCost.get(topping);
    }
}
