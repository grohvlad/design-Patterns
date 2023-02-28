package com.grohvlad.ingredienPortions;

public class CreamPortionCreator implements IngredientPortionCreator {
    @Override
    public IngredientPortion createPortion(Integer portion) {
        IngredientPortion newPortion = new CreamPortion(portion);
        return newPortion;
    }
}
