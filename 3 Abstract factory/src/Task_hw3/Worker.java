package Task_hw3;

import Task_hw3.grohvlad.coffee.*;
import Task_hw3.grohvlad.coffeeMachineMaker.*;
import java.util.ArrayList;
import java.util.Map;

public class Worker{

    private final Menu menu;
    private CoffeeMachineMaker coffeeMachine;
    public Worker(Menu menu, CoffeeMachineMaker coffeeMachine){
        this.menu = menu;
        this.coffeeMachine = coffeeMachine;
    }

    public ArrayList<Coffee> makeOrder(Map<String, Integer> order) {
        ArrayList<Coffee> coffeeForOrder = new ArrayList<>();

        for (String nameOfCoffee : order.keySet()) {
            for (int i = 0; i < order.get(nameOfCoffee); i++) {
                Coffee currentCoffee = null;
                //System.out.println(nameOfCoffee + i);
                switch (nameOfCoffee) {
                    case "Americano" -> currentCoffee = coffeeMachine.makeAmericano();
                    case "Cappuccino" -> currentCoffee = coffeeMachine.makeCappuccino();
                    case "Espresso" -> currentCoffee = coffeeMachine.makeEspresso();
                    case "Latte" -> currentCoffee = coffeeMachine.makeLatte();
                    default -> System.out.println(currentCoffee);//throw new IllegalArgumentException("Cafe doesn't do this coffee");
                }

                if(currentCoffee != null) coffeeForOrder.add(currentCoffee);
            }
        }
        return coffeeForOrder;
    }
}


