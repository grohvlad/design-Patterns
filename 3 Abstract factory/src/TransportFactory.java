import java.util.ArrayList;

abstract class TransportFactory {
    ArrayList<Bus> buyBuses(int number, int cost, int usageCost){
        ArrayList<Bus> busesBatch = new ArrayList<>();
        for(int i= 0; i<number; i++){
            busesBatch.add(buyBus(cost, usageCost));
        }
        return busesBatch;
    }
    protected abstract Bus buyBus(int cost, int usageCost);

    ArrayList<Tram> buyTrams(Integer number, int cost, int usageCost){
        ArrayList<Tram> tramsBatch = new ArrayList<>();
        for(int i= 0; i<number; i++){
            tramsBatch.add(buyTram(cost, usageCost));
        }
        return tramsBatch;
    }
    protected abstract Tram buyTram(int cost, int usageCost);

    ArrayList<Trolleybus> buyTrolleybuses(Integer number, int cost, int usageCost){
        ArrayList<Trolleybus> trolleybusesBatch = new ArrayList<>();
        for(int i= 0; i<number; i++){
            trolleybusesBatch.add(buyTrolleybus(cost, usageCost));
        }
        return trolleybusesBatch;
    }
    protected abstract Trolleybus buyTrolleybus(int cost, int usageCost);
}
