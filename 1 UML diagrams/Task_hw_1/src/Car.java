public class Car {
    final private Engine engine;
    final private Wheel wheel;
    public Car(String model, int number, double power, String wheelMaterial) {
        engine = new Engine(power);
        wheel = new Wheel(wheelMaterial);
    }
}
