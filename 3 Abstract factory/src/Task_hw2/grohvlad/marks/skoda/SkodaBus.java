package Task_hw2.grohvlad.marks.skoda;

import Task_hw2.grohvlad.transport.Bus;

public class SkodaBus extends Bus {

    public SkodaBus(int cost, int usageCost) {
        super(cost, usageCost);
    }

    @Override
    public void goByWay() {
        System.out.println("Skoda bus runs!");
    }
}
