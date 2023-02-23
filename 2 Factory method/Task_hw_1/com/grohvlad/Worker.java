package com.grohvlad;

import com.grohvlad.coffe.*;
import com.grohvlad.ingredienPortions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Worker implements WorkerInCafe{

    private final ICafeInventory inventory;
    private Integer payment;
    public Worker(ICafeInventory inventory, Integer payment){
        this.inventory = inventory;
        this.payment = payment;
    }

    @Override
    public ArrayList<Coffee> Order(Map<String, Integer> order) {
        ArrayList<Coffee> drinks = makeOrder(order);

        if(drinks != null){
            inventory.putCash(calculateCostOfOrder(order, 1));
            return drinks;
        } else {
            System.out.println("Problems with order");
            return new ArrayList<>();
        }
    }

    @Override
    public void getPaid() {
        inventory.takeCash(payment);
    }
    @Override
    public void payForRent() {
        inventory.takeCash(inventory.getPayForCost());
    }

    @Override
    public Integer checkBalance() {
        return  inventory.checkBalance();
    }
    @Override
    public void updateMenu() {
        inventory.updateMenu();
    }

    private ArrayList<Coffee> makeOrder(Map<String, Integer> order) {
        ArrayList<Coffee> coffeeForOrder = new ArrayList<>();
        int cost = calculateCostOfOrder(order, 0);
        if(cost < inventory.checkBalance()){
            Map<String, Integer> ingredientPortionListForOrder = makeIngredientPortionListForOrder(order);

            Map<String,Integer> ingredientAndPortionToBuy = inventory.ingredientsToBuy(ingredientPortionListForOrder);

            int portionAvailableToBuy;
            int amountForOrder;
            if(ingredientAndPortionToBuy.size() > 0){
                //System.out.println(ingredientAndPortionToBuy); //TODO can see the differance
                Map<String,Integer> namePortion = new HashMap<>();

                for (String itemToBuy: ingredientAndPortionToBuy.keySet()){
                    portionAvailableToBuy = inventory.ingredientPortionProposition(itemToBuy);
                    amountForOrder = (int)(ingredientAndPortionToBuy.get(itemToBuy)/portionAvailableToBuy)+1;
                    namePortion.put(itemToBuy, amountForOrder*portionAvailableToBuy);
                }
                buyIngredients(namePortion);

            }

            HashMap<String, IngredientPortion> IngredientsPerOrder =  inventory.takeFromInventory(ingredientPortionListForOrder);

            Map<String, Integer> recipe;
            CoffeeMachine coffeeMachineProgram;
            Coffee coffee;
            HashMap<String, IngredientPortion> ingredientPortionsPerCoffee;

            for(String nameOfDrink: order.keySet()){
                recipe = Data.getRecipe(nameOfDrink);
                coffeeMachineProgram = inventory.chooseCoffeeMachineProgram(nameOfDrink);
                for(int i = 0; i < order.get(nameOfDrink); i++){

                    ingredientPortionsPerCoffee = new HashMap<>();
                    for(String nameOfIngredient: recipe.keySet()){
                        ingredientPortionsPerCoffee.put(nameOfIngredient,
                                IngredientsPerOrder
                                        .get(nameOfIngredient)
                                        .takePartOfPortion(recipe
                                                .get(nameOfIngredient))
                                );
                    }

                    coffee = coffeeMachineProgram.makeCoffee(ingredientPortionsPerCoffee);
                    coffeeForOrder.add(coffee);
                }
            }
            return coffeeForOrder;
        } else{
            System.out.println("You have not enough money for order");
            return null;
        }
    }

    private void buyIngredients(Map<String,Integer> namePortion){

        float currentCPU;
        int cost;
        ArrayList<IngredientPortion> purchase= new ArrayList<>();
        for(String ingredientName: namePortion.keySet()){
            currentCPU = inventory.getCPU(ingredientName);
            cost = (int)(currentCPU * namePortion.get(ingredientName));

            if(inventory.takeCash(cost) == cost){
                IngredientPortionCreator market = inventory.getIngredientSource(ingredientName);
                purchase.add(market.createPortion(namePortion.get(ingredientName)));
            } else {
                System.out.println("something wrong with buying");
            }
        }
        inventory.putToInventory(purchase);
    }

    private Integer calculateCostOfOrder(Map<String, Integer> order, Integer withExtra){
        //TODO
        int finalCost = 0;
        int costPerDrink;
        int costPerIngredient;
        for(String itemFromOrder: order.keySet()){
            costPerDrink = 0;
            Map<String, Integer> recipe = Data.getRecipe(itemFromOrder);

            for(String ingredient: recipe.keySet()) {
                costPerIngredient = (int) (inventory.getCPU(ingredient) * recipe.get(ingredient));
                costPerDrink += costPerIngredient;
            }
            finalCost += (costPerDrink + withExtra * inventory.getExtraCost())*order.get(itemFromOrder);
        }
        return finalCost;
    }

    private Map<String, Integer> makeIngredientPortionListForOrder(Map<String, Integer> order) {
        Map<String, Integer> ingredientPortionListForOrder = new HashMap<>();
        for (String itemFromOrder : order.keySet()) {
            Map<String, Integer> recipe = Data.getRecipe(itemFromOrder);
            for (String ingredient : recipe.keySet()) {
                ingredientPortionListForOrder.put(ingredient,
                        (ingredientPortionListForOrder.get(ingredient)==null ? 0 : ingredientPortionListForOrder.get(ingredient))
                                + recipe.get(ingredient)*order.get(itemFromOrder));
            }
        }
        return ingredientPortionListForOrder;
    }
}


