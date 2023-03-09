package com.grohvlad.where;

public interface IOrder {
    Order.Places getPlace();
    int getCost();
    void describeOrder();
}
