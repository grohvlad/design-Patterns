import java.util.ArrayList;

public class CarSimulator {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        CarBuilder carBuilder = new CarBuilder("Audi", flyweightFactory);
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(carBuilder.buildCar(EngineFlyweight.Petrol.gasoline, EngineFlyweight.Power.p2_0, WheelFlyweight.Material.plastic, WheelFlyweight.Color.black));
        cars.add(carBuilder.buildCar(EngineFlyweight.Petrol.gasoline, EngineFlyweight.Power.p2_0, WheelFlyweight.Material.iron, WheelFlyweight.Color.silver));
        cars.add(carBuilder.buildCar(EngineFlyweight.Petrol.gasoline, EngineFlyweight.Power.p1_3, WheelFlyweight.Material.iron, WheelFlyweight.Color.silver));
        cars.add(carBuilder.buildCar(EngineFlyweight.Petrol.diesel, EngineFlyweight.Power.p2_0, WheelFlyweight.Material.iron, WheelFlyweight.Color.silver));
        cars.add(carBuilder.buildCar(EngineFlyweight.Petrol.diesel, EngineFlyweight.Power.p2_0, WheelFlyweight.Material.iron, WheelFlyweight.Color.silver));
        cars.add(carBuilder.buildCar(EngineFlyweight.Petrol.diesel, EngineFlyweight.Power.p1_6, WheelFlyweight.Material.iron, WheelFlyweight.Color.silver));

        for (Car car: cars){
            System.out.println(car.getInfo());
        }

    }

//    public CarSimulator(){
//        FlyweightFactory flyweightFactory = new FlyweightFactory();
//        CarBuilder carBuilder = new CarBuilder("Audi");
//    }
}