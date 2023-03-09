package com.grohvlad.where;

public interface IOrder {
    AOrder.Places getPlace();
    int getCost();
    void describeOrder();
}
