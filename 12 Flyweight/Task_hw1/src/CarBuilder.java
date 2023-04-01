
public class CarBuilder {
    private String builder;
    private FlyweightFactory flyweightFactory;

    public CarBuilder(String builder, FlyweightFactory flyweightFactory){
        this.builder = builder;
        this.flyweightFactory = flyweightFactory;
    }
    public Car buildCar(EngineFlyweight.Petrol petrol, EngineFlyweight.Power power, WheelFlyweight.Material material, WheelFlyweight.Color color){
        return new Car(builder, flyweightFactory, petrol, power, material, color);
    }
}
