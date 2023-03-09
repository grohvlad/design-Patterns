package com.grohvlad.bevelage;

import com.grohvlad.topping.ITopping;
import com.grohvlad.Singleton;
public class Chocolate extends ABeverage {
    public Chocolate(ITopping topping) {
        this.beverage = Beverages.Chocolate;
        this.topping = topping;
        this.cost = Singleton.getInstance().getBeverageCost(beverage);
    }
}
