package Task_hw3;

import Task_hw3.grohvlad.coffee.Coffee;
import Task_hw3.grohvlad.coffeeMachineMaker.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Cafe{

    public static void main(String[] args){

        Map<String, CoffeeMachineMaker> allFactories = new HashMap<>() {{
            put("Delonghi", new DelonghiCoffeeMachineMaker(24_000, 240, 50 + 24 + 10));
            put("Philips", new PhilipsCoffeeMachineMaker(20_000, 200, 50 + 20 + 20));
            put("Saeco", new SaecoCoffeeMachineMaker(32_000, 320, 50 + 32 + 15));
            put("Siemens", new SiemensCoffeeMachineMaker(19_000, 190, 50 + 19 + 7));
        }};

        for(String coffeeMachineFactory: allFactories.keySet()){
            CoffeeMachineMaker coffeeMachine = allFactories.get(coffeeMachineFactory);
            Cafe cafe = new Cafe(coffeeMachine);
        }
    }

    private final int N = 16;  // орієнтована кількість днів для покриття покупки
    private final int wantToEarnPerMonth = 15_000;
    private final int rentCost = 10_000;
    private final int workerSalary = 600;
    private int startMoney = 0;


    private Worker worker;
    private Menu menu;
    private CoffeeMachineMaker coffeeMachine;

    public Cafe(CoffeeMachineMaker coffeeMachine){
        this.menu = new Menu();
        this.coffeeMachine = coffeeMachine;
        this.worker = new Worker(menu, coffeeMachine);
        workFor_n_Days(N);
    }

    public void workFor_n_Days(Integer n) {
        int satisfactionCoef = coffeeMachine.getSatisfactionCoef();
        Map<String, Integer> averageOPD = new HashMap<>(){{
            put("Americano", (int)(50*satisfactionCoef/100));
            put("Espresso", (int)(45*satisfactionCoef/100));
            put("Latte", (int)(35*satisfactionCoef/100));
            put("Cappuccino", (int)(40*satisfactionCoef/100));
        }};


        int orderCost = calculateCostOfOrder(averageOPD);
        //System.out.println(orderCost);
        int selfCost = calculateSelfCostOfOrder(worker.makeOrder(averageOPD));
        int spendingPerDay = (rentCost + wantToEarnPerMonth)/28 + coffeeMachine.getServCost() + workerSalary + coffeeMachine.getCost()/N;

        int valueToChangeMenu = -(orderCost - selfCost - spendingPerDay)/numberOfOPD(averageOPD);
        menu.updateMenu(valueToChangeMenu);

        System.out.println(coffeeMachine.getName() + " has average orders per day: " + numberOfOPD(averageOPD) + " and menu: ");
        menu.showMenu();
        System.out.println("");
    }

    private int numberOfOPD(Map<String, Integer> OPD){
        int result = 0;
        for(String i: OPD.keySet()){
            result += OPD.get(i);
        }
        return result;
    }

    private Integer calculateCostOfOrder(Map<String, Integer> order){
        int finalCost = 0;
        int costPerDrink;

        for(String itemFromOrder: order.keySet()){
            costPerDrink = menu.drinksCost(itemFromOrder);
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
