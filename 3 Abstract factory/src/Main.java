
import com.grohvlad.factory.*;
import com.grohvlad.transport.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        final int A = 10;       // закупити A автобусів
        final int T = 5;        // закупити T трамваїв
        final int Tr = 40;      // закупити Tr – тролейбусів
        final int N = 200_000;  // орієнтований пробіг експлуатації

        Map<String, TransportFactory> allFactories = new HashMap<>(){{
            put("Volvo", new VolvoFactory());
            put("Skoda", new SkodaFactory());
            put("Hundai", new HundaiFactory());
        }};

        TransportFactory factory;
        for(String factoryName: allFactories.keySet()){
            factory = allFactories.get(factoryName);

            ArrayList<Bus> buses = factory.buyBuses(A);
            ArrayList<Tram> trams = factory.buyTrams(T);
            ArrayList<Trolleybus> trolleybuses = factory.buyTrolleybuses(Tr);

            int finalCostContract = 0;
            for (Bus bus : buses) {
                finalCostContract += bus.getCost() + bus.getUsageCost() * N;
            }

            for (Tram tram : trams) {
                finalCostContract += tram.getCost() + tram.getUsageCost() * N;
            }

            for (Trolleybus trolleybus : trolleybuses) {
                finalCostContract += trolleybus.getCost() + trolleybus.getUsageCost() * N;
            }

            System.out.println(factoryName + ": "+ finalCostContract);
        }
    }
}
