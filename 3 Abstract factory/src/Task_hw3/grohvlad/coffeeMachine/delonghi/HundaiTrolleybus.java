package Task_hw3.grohvlad.coffeeMachine.delonghi;

import Task_hw3.grohvlad.coffee.Trolleybus;

public class HundaiTrolleybus extends Trolleybus {

    public HundaiTrolleybus(int cost, int usageCost) {
        super(cost, usageCost);
    }
    @Override
    public void goByContactNetwork() {
        System.out.println("Hundai trolleybus runs!");
    }
}
