package com.grohvlad.marks.hundai;

import com.grohvlad.transport.Bus;

public class HundaiBus extends Bus {

    public HundaiBus(int cost, int usageCost) {
        super(cost, usageCost);
    }

    @Override
    public void goByWay() {
        System.out.println("Hundai bus runs!");
    }
}
