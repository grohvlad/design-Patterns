package com.grohvlad.bevelage;

import com.grohvlad.topping.ITopping;
import com.grohvlad.Singleton;
public class Chocolate extends ABeverage {
    public Chocolate(ITopping topping) {
        this.beverage = Singleton.Beverage.Chocolate;;
        this.topping = topping;
        this.cost = Singleton.getInstance().getBeverageCost(beverage);
    }
}
