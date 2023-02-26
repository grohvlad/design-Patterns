package Task_hw2.grohvlad.marks.skoda;

import Task_hw2.grohvlad.transport.Tram;

public class SkodaTram extends Tram {
    public SkodaTram(int cost, int usageCost){
        super(cost, usageCost);
    }
    @Override
    public void goByRails() {
        System.out.println("Skoda tram runs!");
    }
}
