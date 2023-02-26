package com.grohvlad.factory;

import com.grohvlad.transport.*;
import java.util.ArrayList;

public abstract class TransportFactory {

    public ArrayList<Bus> buyBuses(int number) {
        ArrayList<Bus> buses = new ArrayList<>();
        for(int i=0; i<number; i++){
            buses.add(buyBus());
        }
        return buses;
    }

    protected abstract Bus buyBus();
//    ArrayList<com.grohvlad.transport.Tram> buyTrams(int number);
//    ArrayList<com.grohvlad.transport.Trolleybus> buyTrolleybuses(int number);
}
