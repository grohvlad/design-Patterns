package com.grohvlad.coffe;
import com.grohvlad.Data;
import com.grohvlad.ingredienPortions.*;

import java.util.Map;

public class AmericanoMaker implements CoffeeMachine {
    private final String drinkName = "Americano";
    @Override
    public Coffee makeCoffee(Map<String, IngredientPortion> portionsToMakeCoffee) {
        Map<String, Integer> recipe = Data.getRecipe(drinkName);
        for(String ingredientName: recipe.keySet()){
            if(recipe.get(ingredientName) > portionsToMakeCoffee.get(ingredientName).getPortion()){
                System.out.printf("problems with making %s",drinkName);
                return null;
            }
        }
        return new Americano();
    }
}
