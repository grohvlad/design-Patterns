public class Engine{
    private static int counter = 0;
    private int ID;
    private EngineFlyweight flyweight;
    public Engine(FlyweightFactory factory, EngineFlyweight.Petrol petrol, EngineFlyweight.Power power){
        this.ID = counter;
        counter++;
        this.flyweight = factory.getEngineFlyweight(petrol, power);

    }
    public String getInfo() {
        return flyweight.getInfo() + " ID:" + this.ID;
    }

    public EngineFlyweight getFlyweight(){
        return this.flyweight;
    }
}
