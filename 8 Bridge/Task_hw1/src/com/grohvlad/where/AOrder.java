package com.grohvlad.where;

import com.grohvlad.bevelage.IBeverage;

import java.util.ArrayList;

public abstract class AOrder implements IOrder{
    public enum Places{ InCafe, InWay}
    protected Places place;
    protected ArrayList<IBeverage> beverageOrder;

    @Override
    public Places getPlace() {
        return place;
    }

    @Override
    public int getCost() {
        int result = 0;
        for(IBeverage beverage: beverageOrder){
            result += beverage.cost();
        }
        return result;
    }

    @Override
    public void describeOrder(){
        int n=15;
        String beverages = "";
        int count = 1;
        for(IBeverage beverage: beverageOrder){
            beverages += count + ") " + beverage.getName() + ".".repeat(n-beverage.getName().length()) + beverage.cost() + "UAH\n";
            count += 1;
        }
        System.out.println("\n" + "_".repeat((n-5+8)/2) + "Order" + "_".repeat((n-5+8)/2) + "\n" + beverages + "Total cost: " + getCost() + "UAH\nPlace: " + getPlace());
    }
}
