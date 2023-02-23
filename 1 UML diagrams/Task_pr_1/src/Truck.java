public class Truck implements Vehicle {
    @Override
    public String runTask() {
        return "Truck is going";
    }

    @Override
    public String getType() {
        return "Truck";
    }
}
