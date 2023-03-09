package com.grohvlad.where;

import com.grohvlad.bevelage.IBeverage;

import java.util.ArrayList;

public class InCafe extends Order {
    public InCafe(ArrayList<IBeverage> order){
        this.place = Places.InCafe;
        this.beverageOrder = order;
    }

}
