package com.grohvlad.bevelage;

import com.grohvlad.Singleton;
import com.grohvlad.topping.ITopping;

public class Tea extends ABeverage{
    public Tea(ITopping topping) {
        this.beverage = Beverages.Tea;;
        this.topping = topping;
        this.cost = Singleton.getInstance().getBeverageCost(beverage);
    }
}
