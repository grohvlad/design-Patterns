package com.grohvlad;

import com.grohvlad.coffe.*;
import com.grohvlad.ingredienPortions.CoffeePortionCreator;
import com.grohvlad.ingredienPortions.CreamPortionCreator;
import com.grohvlad.ingredienPortions.IngredientPortionCreator;
import com.grohvlad.ingredienPortions.SugarPortionCreator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Data{
    private final Integer extraCost = 15;
    public Integer getExtraCost(){return extraCost;}

    private final Integer rentCost = 10000;
    public Integer getRentCost(){ return rentCost;}

    private final Map<String, Map<String,Integer>> Market = new HashMap<>(){{
        put("Cream", new HashMap<>(){{
            put("portion", 500);  //500 g
            put("cost", 95);      //95 UAH
        }});
        put("Coffee", new HashMap<>(){{
            put("portion", 1000);  //1000 g
            put("cost", 400);      //400 UAH
        }});
        put("Sugar", new HashMap<>(){{
            put("portion", 1000);  //1000 g
            put("cost", 42);      //42 UAH
        }});
    }};
    public Map<String, Integer> ingredientProposition(String nameOfIngredient){
        return  Market.get(nameOfIngredient);
    }

    private static final Map<String, Map<String, Integer>> bookOfRecipes = new HashMap<>(){{
        put("Espresso", new HashMap<>(){{
            put("Coffee",7);
            //put("Sugar",5);
        }});
        put("Americano", new HashMap<>(){{
            put("Coffee",10);
           put("Sugar",5);
        }});
        put("Latte", new HashMap<>(){{
            put("Coffee",5);
            put("Sugar",10);
        }});
        put("Cappuccino", new HashMap<>(){{
            put("Coffee",4);
            put("Sugar",15);
            put("Cream",100);
        }});
    }};
    public static Map<String,Integer> getRecipe(String nameOfOrder){
        return bookOfRecipes.get(nameOfOrder);
    }

    ///////////////////////////////////////////////////
    //Menu
    ///////////////////////////////////////////////////
    public static Map<String, Integer> menu = new HashMap<>();


    public void updateMenu(){
        setDrinkCosts();
    }

    private void setDrinkCosts(){
        Map<String, Integer> recipe;
        Integer drinkCost;

        for(String nameOfDrink: bookOfRecipes.keySet()){
            recipe = getRecipe(nameOfDrink);
            drinkCost = calculateSelfCostOfDrink(recipe);
            menu.put(nameOfDrink,drinkCost + extraCost);
        }
    }
    private Integer calculateSelfCostOfDrink (Map<String,Integer> recipe){
        int selfCostOfDrink = 0;
        for(String nameOfIngredient: recipe.keySet()){
            selfCostOfDrink += (int)((getCPU(nameOfIngredient)) * recipe.get(nameOfIngredient));
            getCPU(nameOfIngredient);
        }
        return selfCostOfDrink;
    }
    private float calculateCPU(Map<String,Integer> ingredient){
        return ((float) ingredient.get("cost"))/ingredient.get("portion");
    }

    public float getCPU(String nameOfIngredient){
        return calculateCPU(Market.get(nameOfIngredient));
    }

    ///////////////////////////////////////////////////
    //Ingredient source and coffee programs
    ///////////////////////////////////////////////////
    private final IngredientPortionCreator coffeePortionSource = new CoffeePortionCreator();
    private final IngredientPortionCreator sugarPortionSource = new SugarPortionCreator();
    private final IngredientPortionCreator creamPortionSource = new CreamPortionCreator();
    private final Map<String, IngredientPortionCreator> ingredientSource = new HashMap<>(){{
        put("Coffee", coffeePortionSource);
        put("Sugar", sugarPortionSource);
        put("Cream", creamPortionSource);
    }};

    private final CoffeeMachine espressoMachineProgram = new EspressoMaker();
    private final CoffeeMachine americanoMachineProgram = new AmericanoMaker();
    private final CoffeeMachine latteMachineProgram = new LatteMaker();
    private final CoffeeMachine cappuccinoMachineProgram = new CappuccinoMaker();
    private final Map<String, CoffeeMachine> coffeeMachinePrograms = new HashMap<>(){{
        put("Americano", americanoMachineProgram);
        put("Espresso", espressoMachineProgram);
        put("Latte", latteMachineProgram);
        put("Cappuccino", cappuccinoMachineProgram);
    }};

    public CoffeeMachine chooseCoffeeMachineProgram (String coffee){
        return  coffeeMachinePrograms.get(coffee);
    }
    public IngredientPortionCreator getIngredientSource(String ingredientName){
        return ingredientSource.get(ingredientName);
    }

}
