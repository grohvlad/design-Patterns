package Task_hw3.grohvlad.coffeeMachine.delonghi;

import Task_hw3.grohvlad.coffee.Bus;

public class HundaiBus extends Bus {

    public HundaiBus(int cost, int usageCost) {
        super(cost, usageCost);
    }

    @Override
    public void goByWay() {
        System.out.println("Hundai bus runs!");
    }
}
