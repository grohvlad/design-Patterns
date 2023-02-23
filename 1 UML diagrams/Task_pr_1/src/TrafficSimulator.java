import java.util.Random;
public class TrafficSimulator {
    public static void main(String[] args) {
        TrafficSimulator simulator = new TrafficSimulator();
        Vehicle car = simulator.createRandomCar();
        String carType = car.getType();
        System.out.println(carType);
        String resCarTask = car.runTask();
        System.out.printf("Task is completed, %s",resCarTask);
    }

    Vehicle createRandomCar(){
        Random random = new Random();
        boolean b = random.nextBoolean();
        return b ? new Car() : new Truck();
    }
}
