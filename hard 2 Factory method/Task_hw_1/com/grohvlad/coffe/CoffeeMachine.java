package com.grohvlad.coffe;

import com.grohvlad.ingredienPortions.IngredientPortion;

import java.util.ArrayList;
import java.util.Map;

public interface CoffeeMachine {
    Coffee makeCoffee(Map<String, IngredientPortion> portionsToMakeCoffee);
}
