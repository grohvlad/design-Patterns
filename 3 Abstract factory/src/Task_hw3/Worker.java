package Task_hw3;

import Task_hw3.grohvlad.coffee.*;
import Task_hw3.grohvlad.coffeeMachineMaker.*;
import java.util.ArrayList;
import java.util.Map;

public class Worker implements WorkerInCafe{

    private final Data data;
    private Integer payment;
    public Worker(Data data, Integer payment){
        this.data = data;
        this.payment = payment;
    }


    @Override
    public ArrayList<Coffee> Order(Map<String, Integer> order) {
        ArrayList<Coffee> drinks = makeOrder(order);

        if(drinks != null){
            data. putCash(calculateCostOfOrder(order));
            return drinks;
        } else {
            System.out.println("Problems with order");
            return new ArrayList<>();
        }
    }

    @Override
    public void getPaid() {
        data.takeCash(payment);
    }
    @Override
    public void payForRent() {
        data.takeCash(data.getRentCost());
    }


    private ArrayList<Coffee> makeOrder(Map<String, Integer> order, CoffeeMachineMaker coffeeMachine) {
        ArrayList<Coffee> coffeeForOrder = new ArrayList<>();

        for (String nameOfCoffee : order.keySet()) {
            for (int i = 0; i < order.get(nameOfCoffee); i++) {
                Coffee currentCoffee = null;

                switch (nameOfCoffee) {
                    case "Americano" -> currentCoffee = coffeeMachine.makeAmericano();
                    case "Cappuccino" -> currentCoffee = coffeeMachine.makeCappuccino();
                    case "Espresso" -> currentCoffee = coffeeMachine.makeEspresso();
                    case "Late" -> currentCoffee = coffeeMachine.makeLatte();
                    default -> throw new IllegalArgumentException("Cafe doesn't do this coffee");
                }

                coffeeForOrder.add(currentCoffee);
            }
        }
        return coffeeForOrder;
    }


    private Integer calculateCostOfOrder(Map<String, Integer> order){
        int finalCost = 0;
        int costPerDrink;

        for(String itemFromOrder: order.keySet()){
            costPerDrink = data.drinksCost(itemFromOrder);
            finalCost += costPerDrink * order.get(itemFromOrder);
        }
        return finalCost;
    }

    private Integer calculateSelfCostOfOrder(ArrayList<Coffee> coffeeForOrder){
        int finalCost = 0;
        for (Coffee coffee: coffeeForOrder){
            finalCost += coffee.getSelfCost();
        }
        return finalCost;
    }
}


