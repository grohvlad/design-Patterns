package com.grohvlad.ingredienPortions;

public class SugarPortionCreator implements IngredientPortionCreator {
    @Override
    public IngredientPortion createPortion(Integer portion) {
        IngredientPortion newPortion = new SugarPortion(portion);
        return newPortion;
    }
}
