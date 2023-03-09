package com.grohvlad.bevelage;

import com.grohvlad.Singleton;
import com.grohvlad.topping.ITopping;

public class Coffee extends ABeverage{
    public Coffee(ITopping topping) {
        this.beverage = Beverages.Coffee;;
        this.topping = topping;
        this.cost = Singleton.getInstance().getBeverageCost(beverage);
    }
}
