package com.grohvlad.factory;

import com.grohvlad.factory.*;
import com.grohvlad.marks.volvo.VolvoBus;
import com.grohvlad.marks.volvo.VolvoTram;
import com.grohvlad.marks.volvo.VolvoTrolleybus;
import com.grohvlad.transport.*;

import java.util.HashMap;
import java.util.Map;

public class VolvoFactory extends TransportFactory {
    Map<String, Map<String,Integer>> VolvoProducts = new HashMap<>(){{
        put("com.grohvlad.transport.Bus", new HashMap<>(){{
            put("cost", 6_000_000);
            put("usage cost", 20);
        }});
        put("com.grohvlad.transport.Tram", new HashMap<>(){{
            put("cost", 10_000_000);
            put("usage cost", 7);
        }});
        put("com.grohvlad.transport.Trolleybus", new HashMap<>(){{
            put("cost", 7_000_000);
            put("usage cost",13);
        }});
    }};

//    @Override
//    public ArrayList<com.grohvlad.transport.Bus> buyBuses(int number) {
//        ArrayList<com.grohvlad.transport.Bus> buses = new ArrayList<>();
//        for(int i=0; i<number; i++){
//            buses.add(buyBus());
//        }
//        return buses;
//    }

//    @Override
//    public ArrayList<com.grohvlad.transport.Tram> buyTrams(int number) {
//        ArrayList<com.grohvlad.transport.Tram> trams = new ArrayList<>();
//        for(int i=0; i<number; i++){
//            trams.add(buyTram());
//        }
//        return trams;
//    }
//
//    @Override
//    public ArrayList<com.grohvlad.transport.Trolleybus> buyTrolleybuses(int number) {
//        ArrayList<com.grohvlad.transport.Trolleybus> trolleybuses = new ArrayList<>();
//        for(int i=0; i<number; i++){
//            trolleybuses.add(buyTrolleybus());
//        }
//        return trolleybuses;
//    }


    @Override
    protected Bus buyBus(){
        return new VolvoBus( VolvoProducts.get("com.grohvlad.transport.Bus").get("cost"), VolvoProducts.get("com.grohvlad.transport.Bus").get("usage cost"));
    }
    private Tram buyTram(){
        return new VolvoTram( VolvoProducts.get("com.grohvlad.transport.Tram").get("cost"), VolvoProducts.get("com.grohvlad.transport.Tram").get("usage cost"));
    }
    private Trolleybus buyTrolleybus(){
        return new VolvoTrolleybus( VolvoProducts.get("com.grohvlad.transport.Trolleybus").get("cost"), VolvoProducts.get("com.grohvlad.transport.Trolleybus").get("usage cost"));
    }
//
//    @Override
//    public com.grohvlad.transport.Tram buyTram(int cost, int usageCost) {
//        return new com.grohvlad.volvo.VolvoTram(cost, usageCost);
//    }
//
//    @Override
//    public com.grohvlad.transport.Trolleybus buyTrolleybus(int cost, int usageCost) {
//        return new com.grohvlad.volvo.VolvoTrolleybus(cost, usageCost);
//    }
}
