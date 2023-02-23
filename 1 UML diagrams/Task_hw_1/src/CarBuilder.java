public class CarBuilder {
    //let`s build some car...
    private String wheelMaterial;
    private double power;
    private String model;
    private int number;

    public CarBuilder(String model, int number,  double power, String wheelMaterial) {
        this.wheelMaterial = wheelMaterial;
        this.power = power;
        this.model = model;
        this.number = number;
    }

    Wheel wheel = new Wheel(wheelMaterial);
    Car car = new Car(model, number, power, wheelMaterial);

}
