
import com.grohvlad.factory.*;
import com.grohvlad.factory.*;
import com.grohvlad.transport.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TransportFactory factory;

        factory = new VolvoFactory();
        ArrayList<Bus> buses = factory.buyBuses(2);
        buses.get(1).goByWay();
    }
}

//    ArrayList<com.grohvlad.transport.Bus> buses = new ArrayList<>();
//    ArrayList<com.grohvlad.transport.Tram> trams = new ArrayList<>();
//    ArrayList<com.grohvlad.transport.Trolleybus> trolleybuses = new ArrayList<>();
//
//    final int A = 10;       // закупити A автобусів
//    final int T = 5;        // закупити T трамваїв
//    final int Tr = 40;      // закупити Tr – тролейбусів
//    final int N = 200_000;  // орієнтований пробіг експлуатації
//
//        for (int i = 0; i < A; i++) {
//        com.grohvlad.transport.Bus bus = new com.grohvlad.transport.Bus(4500000, 25);
//        buses.add(bus);
//        }
//
//        for (int i = 0; i < T; i++) {
//        com.grohvlad.transport.Tram tram = new com.grohvlad.transport.Tram(9_000_000, 8);
//        trams.add(tram);
//        }
//
//        for (int i = 0; i < Tr; i++) {
//        com.grohvlad.transport.Trolleybus trolley = new com.grohvlad.transport.Trolleybus(6_800_000, 13);
//        trolleybuses.add(trolley);
//        }
//
//        int finalCostContract = 0;
//        for (com.grohvlad.transport.Bus bus : buses) {
//        finalCostContract += bus.getCost() + bus.getUsageCost() * N;
//        }
//
//        for (com.grohvlad.transport.Tram tram : trams) {
//        finalCostContract += tram.getCost() + tram.getUsageCost() * N;
//        }
//
//        for (com.grohvlad.transport.Trolleybus trolleybus : trolleybuses) {
//        finalCostContract += trolleybus.getCost() + trolleybus.getUsageCost() * N;
//        }
//
//        System.out.println(finalCostContract);