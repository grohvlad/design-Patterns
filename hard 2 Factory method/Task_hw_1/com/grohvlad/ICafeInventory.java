package com.grohvlad;
import com.grohvlad.coffe.CoffeeMachine;
import com.grohvlad.ingredienPortions.IngredientPortion;
import com.grohvlad.ingredienPortions.IngredientPortionCreator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public interface ICafeInventory {
    void putCash(int cashToPut);
    Integer checkBalance();
    Integer takeCash(int amountToTake);

    Map<String, Integer> ingredientsToBuy(Map<String, Integer> ingredientPortionListForOrder);
    HashMap<String, IngredientPortion> takeFromInventory(Map<String, Integer> listToTake);
    void putToInventory(ArrayList<IngredientPortion> IngredientsToPut);

    float getCPU(String nameOfIngredient);
    Integer ingredientPortionProposition(String itemToBuy);
    IngredientPortionCreator getIngredientSource(String ingredientName);
    CoffeeMachine chooseCoffeeMachineProgram (String coffee);
    Integer getExtraCost();
    Integer getPayForCost();
    void updateMenu();
}
