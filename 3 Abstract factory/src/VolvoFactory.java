import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class VolvoFactory implements TransportFactory{
    Map<String, Map<String,Integer>> VolvoProducts = new HashMap<>(){{
        put("Bus", new HashMap<>(){{
            put("cost", 6_000_000);
            put("usage cost", 20);
        }});
        put("Tram", new HashMap<>(){{
            put("cost", 10_000_000);
            put("usage cost", 7);
        }});
        put("Trolleybus", new HashMap<>(){{
            put("cost", 7_000_000);
            put("usage cost",13);
        }});
    }};

    @Override
    public ArrayList<Bus> buyBuses(int number) {
        ArrayList<Bus> buses = new ArrayList<>();
        for(int i=0; i<number; i++){
            buses.add(buyBus());
        }
        return buses;
    }

    @Override
    public ArrayList<Tram> buyTrams(int number) {
        ArrayList<Tram> trams = new ArrayList<>();
        for(int i=0; i<number; i++){
            trams.add(buyTram());
        }
        return trams;
    }

    @Override
    public ArrayList<Trolleybus> buyTrolleybuses(int number) {
        ArrayList<Trolleybus> trolleybuses = new ArrayList<>();
        for(int i=0; i<number; i++){
            trolleybuses.add(buyTrolleybus());
        }
        return trolleybuses;
    }


    private Bus buyBus(){
        return new VolvoBus( VolvoProducts.get("Bus").get("cost"), VolvoProducts.get("Bus").get("usage cost"));
    }
    private Tram buyTram(){
        return new VolvoTram( VolvoProducts.get("Tram").get("cost"), VolvoProducts.get("Tram").get("usage cost"));
    }
    private Trolleybus buyTrolleybus(){
        return new VolvoTrolleybus( VolvoProducts.get("Trolleybus").get("cost"), VolvoProducts.get("Trolleybus").get("usage cost"));
    }
//
//    @Override
//    public Tram buyTram(int cost, int usageCost) {
//        return new VolvoTram(cost, usageCost);
//    }
//
//    @Override
//    public Trolleybus buyTrolleybus(int cost, int usageCost) {
//        return new VolvoTrolleybus(cost, usageCost);
//    }
}
