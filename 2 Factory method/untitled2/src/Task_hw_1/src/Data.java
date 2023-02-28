import com.grohvlad.coffe.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Data{
    private int startAmountOfMoney =  10000;
    private final int rentCost = 10000;
    public Integer getRentCost(){ return rentCost;}

    ///////////////////////////////////////////////////
    //
    ///////////////////////////////////////////////////
    public void takeCash(int amount){
        if(startAmountOfMoney - amount > 0){
            startAmountOfMoney -= amount;
        } else{
            System.out.println("Not enough money to take");
        }
    }

    public int checkBalance(){ return startAmountOfMoney;}
    public void putCash(int cashToPut) {
        if(cashToPut > 0){
            startAmountOfMoney += cashToPut;
        } else {
            System.out.println("You tried to steal the money");
        }
    }
    ///////////////////////////////////////////////////
    //Menu
    ///////////////////////////////////////////////////
    private Map<String, Integer> menu = new HashMap<>(){{
        put("Americano", 30);
        put("Espresso", 35);
        put("Latte", 40);
        put("Cappuccino", 45);
    }};

    public void showMenu(){
        System.out.println(menu.toString());
    }

    public int drinksCost(String name){
        return menu.get(name);
    }

    public Set<String> availableDrinks(){
        return menu.keySet();
    }
    ///////////////////////////////////////////////////
    //Coffee programs
    ///////////////////////////////////////////////////

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
}
