package Task_hw2.grohvlad.marks.hundai;

import Task_hw2.grohvlad.transport.Trolleybus;
public class HundaiTrolleybus extends Trolleybus {

    public HundaiTrolleybus(int cost, int usageCost) {
        super(cost, usageCost);
    }
    @Override
    public void goByContactNetwork() {
        System.out.println("Hundai trolleybus runs!");
    }
}
