package com.grohvlad.marks.hundai;

import com.grohvlad.transport.Trolleybus;
public class HundaiTrolleybus extends Trolleybus {

    public HundaiTrolleybus(int cost, int usageCost) {
        super(cost, usageCost);
    }
    @Override
    public void goByContactNetwork() {
        System.out.println("Hundai trolleybus runs!");
    }
}
