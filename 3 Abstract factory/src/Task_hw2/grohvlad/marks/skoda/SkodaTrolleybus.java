package Task_hw2.grohvlad.marks.skoda;

import Task_hw2.grohvlad.transport.Trolleybus;
public class SkodaTrolleybus extends Trolleybus {

    public SkodaTrolleybus(int cost, int usageCost) {
        super(cost, usageCost);
    }
    @Override
    public void goByContactNetwork() {
        System.out.println("Skoda trolleybus runs!");
    }
}
