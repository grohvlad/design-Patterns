package Task_hw3.grohvlad.coffeeMachineMaker;

import Task_hw3.grohvlad.coffee.Bus;
import Task_hw3.grohvlad.coffee.Tram;
import Task_hw3.grohvlad.coffee.Trolleybus;

import java.util.ArrayList;

public abstract class TransportFactory {

    public ArrayList<Bus> buyBuses(int number) {
        ArrayList<Bus> buses = new ArrayList<>();
        for(int i=0; i<number; i++){
            buses.add(buyBus());
        }
        return buses;
    }
    public ArrayList<Tram> buyTrams(int number) {
        ArrayList<Tram> trams = new ArrayList<>();
        for(int i=0; i<number; i++){
            trams.add(buyTram());
        }
        return trams;
    }

    public ArrayList<Trolleybus> buyTrolleybuses(int number) {
        ArrayList<Trolleybus> trolleybuses = new ArrayList<>();
        for(int i=0; i<number; i++){
            trolleybuses.add(buyTrolleybus());
        }
        return trolleybuses;
    }

    protected abstract Bus buyBus();
    protected abstract Tram buyTram();
    protected abstract Trolleybus buyTrolleybus();

}
