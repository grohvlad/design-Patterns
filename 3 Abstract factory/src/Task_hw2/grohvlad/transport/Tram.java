package Task_hw2.grohvlad.transport;

public abstract class Tram {
    public Tram(int cost, int usageCost) {
        this.cost = cost;
        this.usageCost = usageCost;
    }

    public int getCost() {
        return cost;
    }

    public int getUsageCost() {
        return usageCost;
    }

    public void goByRails() {
        System.out.println("Task_hw2.grohvlad.transport.Tram runs!");
    }

    protected int cost;       // Вартість одиниці транспорту
    protected int usageCost;  //  Вартість експлуатації = вартість одного кілометру пробігу

}