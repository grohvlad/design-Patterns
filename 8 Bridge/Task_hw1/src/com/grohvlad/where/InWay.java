package com.grohvlad.where;

import com.grohvlad.bevelage.*;

import java.util.ArrayList;

public class InWay extends AOrder {
    public InWay(ArrayList<IBeverage> order){
        this.place = Places.InWay;
        this.beverageOrder = order;
    }
}
