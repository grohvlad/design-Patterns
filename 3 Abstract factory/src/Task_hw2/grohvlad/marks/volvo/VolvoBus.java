package Task_hw2.grohvlad.marks.volvo;

import Task_hw2.grohvlad.transport.Bus;

public class VolvoBus extends Bus {

    public VolvoBus(int cost, int usageCost) {
        super(cost, usageCost);
    }

    @Override
    public void goByWay() {
        System.out.println("Volvo bus runs!");
    }
}
