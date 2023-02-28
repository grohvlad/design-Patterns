package com.grohvlad;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Cafe implements ICafe{
    private WorkerInCafe worker;
    public Cafe(){
        ICafeInventory inventory = new Inventory(10000);
        worker = findWorker(inventory, 500);
    }

    private WorkerInCafe findWorker(ICafeInventory inventory, Integer payPerDay){
        return new Worker(inventory, payPerDay);
    }

    private Map<Integer, Map<String,Integer>> record = new HashMap<>();
    private Map<String,Integer> statistics = new HashMap<>();
    @Override
    public void workFor_n_Days(Integer n) {
        Map<String, Integer> OPD;
        worker.updateMenu();

        for(Integer day = 1; day <= n; day++){
            if (n%28 == 0){worker.payForRent();}
            OPD = ordersPerDay();
            //
            record.put(day,OPD);
            for(String order: OPD.keySet()){

                statistics.put(order, (statistics.get(order) == null ? 0 : statistics.get(order))  + OPD.get(order));
            }
            worker.Order(OPD);
            worker.getPaid();
        }
    }

    @Override
    public void getStatistics() {
        System.out.println(statistics.toString());
        System.out.printf("Balance is: %s",worker.checkBalance());
    }

    ///////////////////////////////////////////////////
    //Generate orders
    ///////////////////////////////////////////////////
    private final int averageNumberOfVisitors = 40;
    private final int deviationNumberOfVisitors = 10;
    private final int averageNumberOfDrinksInCheck = 2;
    private final float deviationNumberOfDrinksInCheck = 0.2F;
    private Random random = new Random();

    private Map<String,Integer> ordersPerDay(){
        Map<String, Integer> ordersPerDayList = new HashMap<>();
        int numberOfConsumers = (int) (random.nextGaussian()* deviationNumberOfVisitors)+averageNumberOfVisitors;
        int numberOfDrinks = (int)(numberOfConsumers*(random.nextGaussian()*0.5+averageNumberOfDrinksInCheck));

        ArrayList<String> menuDrinks = new ArrayList<>(Data.menu.keySet());
        for(int i = menuDrinks.size(); i>1 ; i--){
            int a = (int) (numberOfDrinks/i);
            int forThisDrink = (int)(random.nextGaussian()*deviationNumberOfDrinksInCheck*a) + a;
            numberOfDrinks -= forThisDrink;

            ordersPerDayList.put(menuDrinks.get(menuDrinks.size()-i), forThisDrink);
        }
        ordersPerDayList.put(menuDrinks.get(menuDrinks.size()-1),numberOfDrinks);
        return ordersPerDayList;
    }
}
