public class EngineFlyweight {
    enum Petrol{ diesel, gasoline, gas}
    enum Power{ p1_3, p1_4, p1_6, p2_0}

    private String NO;
    private Power power;
    private Petrol petrol;
    public EngineFlyweight(Petrol petrol, Power power){
        this.petrol = petrol;
        this.power = power;
        this.NO = "№" + petrol.toString().substring(0,1) + "_" + power.toString();
    }

    public String getInfo(){
        return  petrol.toString() + " " + power.toString() + " engine " + NO;
    }
}
