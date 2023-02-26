package Task_hw2.grohvlad.marks.volvo;

import Task_hw2.grohvlad.transport.Trolleybus;
public class VolvoTrolleybus extends Trolleybus {

    public VolvoTrolleybus(int cost, int usageCost) {
        super(cost, usageCost);
    }
    @Override
    public void goByContactNetwork() {
        System.out.println("Volvo trolleybus runs!");
    }
}
