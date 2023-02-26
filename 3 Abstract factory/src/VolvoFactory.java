public class VolvoFactory extends TransportFactory{

    @Override
    protected Bus buyBus(int cost, int usageCost) {
        return new VolvoBus(cost, usageCost);
    }

    @Override
    public Tram buyTram(int cost, int usageCost) {
        return new VolvoTram(cost, usageCost);
    }

    @Override
    public Trolleybus buyTrolleybus(int cost, int usageCost) {
        return new VolvoTrolleybus(cost, usageCost);
    }
}