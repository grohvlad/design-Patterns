package com.grohvlad.marks.volvo;

import com.grohvlad.transport.*;
public class VolvoTrolleybus extends Trolleybus {

    public VolvoTrolleybus(int cost, int usageCost) {
        super(cost, usageCost);
    }
    @Override
    public void goByContactNetwork() {
        System.out.println("Volvo trolleybus runs!");
    }
}