package com.grohvlad.marks.volvo;

import com.grohvlad.transport.*;

public class VolvoTram extends Tram {
    public VolvoTram(int cost, int usageCost){
        super(cost, usageCost);
    }
    @Override
    public void goByRails() {
        System.out.println("Volvo tram runs!");
    }
}
