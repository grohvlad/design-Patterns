package com.grohvlad.marks.skoda;

import com.grohvlad.transport.Tram;

public class SkodaTram extends Tram {
    public SkodaTram(int cost, int usageCost){
        super(cost, usageCost);
    }
    @Override
    public void goByRails() {
        System.out.println("Skoda tram runs!");
    }
}
