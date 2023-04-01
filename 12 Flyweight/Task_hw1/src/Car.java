public class Car {
    private WheelFlyweight wheel;
    private Engine engine;
    private String builder;


    public Car(String builder, FlyweightFactory flyweightFactory, EngineFlyweight.Petrol petrol, EngineFlyweight.Power power, WheelFlyweight.Material material, WheelFlyweight.Color color) {
        this.engine = new Engine(flyweightFactory, petrol, power);
        this.wheel = flyweightFactory.getWheelFlyweight(material, color);
        this.builder = builder;
    }

    public String getInfo() {
        return builder + " car with " + wheel + " and " + engine + " model: " + engine.getFlyweight();
    }
}
