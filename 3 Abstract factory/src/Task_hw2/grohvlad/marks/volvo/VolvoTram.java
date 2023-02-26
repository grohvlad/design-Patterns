package Task_hw2.grohvlad.marks.volvo;

import Task_hw2.grohvlad.transport.Tram;

public class VolvoTram extends Tram {
    public VolvoTram(int cost, int usageCost){
        super(cost, usageCost);
    }
    @Override
    public void goByRails() {
        System.out.println("Volvo tram runs!");
    }
}
