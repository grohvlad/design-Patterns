package Task_hw2.grohvlad.marks.hundai;

import Task_hw2.grohvlad.transport.Tram;

public class HundaiTram extends Tram {
    public HundaiTram(int cost, int usageCost){
        super(cost, usageCost);
    }
    @Override
    public void goByRails() {
        System.out.println("Hundai tram runs!");
    }
}
