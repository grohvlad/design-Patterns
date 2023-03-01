package Task_hw3.grohvlad.coffeeMachine.delonghi;

import Task_hw3.grohvlad.coffee.Tram;

public class HundaiTram extends Tram {
    public HundaiTram(int cost, int usageCost){
        super(cost, usageCost);
    }
    @Override
    public void goByRails() {
        System.out.println("Hundai tram runs!");
    }
}
