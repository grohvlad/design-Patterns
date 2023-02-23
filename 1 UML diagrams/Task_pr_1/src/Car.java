public class Car implements Vehicle {
    @Override
    public String runTask() {
        return "Car is going";
    }

    @Override
    public String getType() {
        return "Car Type";
    }
}
