package com.grohvlad.ingredienPortions;

public class CoffeePortionCreator implements IngredientPortionCreator {
    @Override
    public IngredientPortion createPortion(Integer portion) {
        IngredientPortion newPortion = new CoffeePortion(portion);
        return newPortion;
    }
}
