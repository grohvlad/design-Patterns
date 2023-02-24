package com.grohvlad;

import com.grohvlad.coffe.CoffeeMachine;
import com.grohvlad.ingredienPortions.IngredientPortion;
import com.grohvlad.ingredienPortions.IngredientPortionCreator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Inventory implements ICafeInventory {
    ///////////////////////////////////////////////////
    //Cash
    ///////////////////////////////////////////////////
    private int cash;
    Data data;

    public Inventory(int cash) {
        this.cash = cash;
        this.data = new Data();

    }

    @Override
    public void putCash(int cashToPut) {
        if(cashToPut > 0){
            cash += cashToPut;
        } else {
            System.out.println("You tried to steal the money");
        }
    }

    @Override
    public Integer checkBalance() {
        return cash;
    }

    @Override
    public Integer takeCash(int amountToTake) {
        if(cash - amountToTake > 0){
            cash -= amountToTake;
            return amountToTake;
        } else{
            System.out.println("Not enough money to take");
            return 0;
        }
    }

    @Override
    public Integer getExtraCost(){return data.getExtraCost();}
    @Override
    public Integer getPayForCost(){return data.getRentCost();}

    @Override
    public void updateMenu() {
        data.updateMenu();
    }

    ///////////////////////////////////////////////////
    //Ingredients
    ///////////////////////////////////////////////////
    private final Map<String, IngredientPortion> storedIngredients = new HashMap<>();

    @Override
    public Map<String, Integer> ingredientsToBuy(Map<String, Integer> ingredientPortionListForOrder){
        Map<String, Integer> ingredientAndPortionToBuy = new HashMap<>();
        int differance;

        for(String ingredient: ingredientPortionListForOrder.keySet()){
            differance = (getStoredIngredient(ingredient) == null ? 0 : getStoredIngredient(ingredient).getPortion()) - ingredientPortionListForOrder.get(ingredient);
            if(differance < 0){
                ingredientAndPortionToBuy.put(ingredient, -differance);
            }
        }
        return ingredientAndPortionToBuy;
    }

    private IngredientPortion getStoredIngredient(String nameOfStoredIngredient) {
        return storedIngredients.get(nameOfStoredIngredient);
    }
    private void putIngredientToStore(IngredientPortion ingredientPortion){
        storedIngredients.put(ingredientPortion.getName(), ingredientPortion);
    }
    private Boolean hasStoredIngredient(String ingredientName){
        return storedIngredients.containsKey(ingredientName);
    }

    @Override
    public HashMap<String,IngredientPortion> takeFromInventory(Map<String, Integer> listToTake) {
        HashMap<String, IngredientPortion> ingredientPortionsFromInventory = new HashMap<>();
        //System.out.println(listToTake); //
        Integer portion;
        for (String ingredientName: listToTake.keySet()){
            portion = listToTake.get(ingredientName);

            if(!hasStoredIngredient(ingredientName)){
                System.out.printf("There is no %s in the inventory",ingredientName);
                return null;
            } else if(getStoredIngredient(ingredientName).getPortion() < portion){
                System.out.printf("There is not enough %s in the inventory",ingredientName);
                return null;
            } else {
                ingredientPortionsFromInventory.put( ingredientName,
                        getStoredIngredient(ingredientName).takePartOfPortion(portion)
                );
            }
        }
        return ingredientPortionsFromInventory;
    }

    @Override
    public void putToInventory(ArrayList<IngredientPortion> ingredientsToPut) {
        IngredientPortion ingredientPortionToPut;
        String nameOfPortionToPut;
        for(int i=0; i< ingredientsToPut.size(); i++){
            ingredientPortionToPut = ingredientsToPut.get(i);
            nameOfPortionToPut = ingredientPortionToPut.getName();

            if(hasStoredIngredient(nameOfPortionToPut)){
                getStoredIngredient(nameOfPortionToPut).combineWithPortion(ingredientPortionToPut);
            } else {
                putIngredientToStore(ingredientPortionToPut);
            }
        }
    }
    ///////////////////////////////////////////////////
    //Data
    ///////////////////////////////////////////////////
    @Override
    public float getCPU(String nameOfIngredient){
        return data.getCPU(nameOfIngredient);
    }
    @Override
    public Integer ingredientPortionProposition(String itemToBuy){
       return data.ingredientProposition(itemToBuy).get("portion");
    }
    @Override
    public IngredientPortionCreator getIngredientSource(String ingredientName){
        return  data.getIngredientSource(ingredientName);
    }

    public CoffeeMachine chooseCoffeeMachineProgram (String coffee){
        return data.chooseCoffeeMachineProgram(coffee);
    }



}

