import java.util.ArrayList;

interface TransportFactory {
    ArrayList<Bus> buyBuses(int number);
    ArrayList<Tram> buyTrams(int number);
    ArrayList<Trolleybus> buyTrolleybuses(int number);
}
