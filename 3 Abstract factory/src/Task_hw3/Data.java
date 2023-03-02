package Task_hw3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Data{
    private int startAmountOfMoney;
    private final int rentCost;

    public Data(int startAmountOfMoney, int rentCost) {
        this.startAmountOfMoney = startAmountOfMoney;
        this.rentCost = rentCost;
    }


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
//        put("Americano", 30);
//        put("Espresso", 35);
//        put("Latte", 40);
//        put("Cappuccino", 45);
    }};

    public void changeMenu(String nameOfDrink, int cost){
        menu.put(nameOfDrink,cost);
    }

    public int drinksCost(String name){
        return menu.get(name);
    }

    public Set<String> availableDrinks(){
        return menu.keySet();
    }


}
