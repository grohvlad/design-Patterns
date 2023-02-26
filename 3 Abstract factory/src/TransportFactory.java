import java.util.ArrayList;

interface TransportFactory {

    Bus buyBus(int cost, int usageCost);
    Tram buyTram(int cost, int usageCost);
    Trolleybus buyTrolleybus(int cost, int usageCost);
}
