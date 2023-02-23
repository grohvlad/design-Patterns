public class CarSimulator {
    public static void main(String[] args) {
        CarSimulator carSimulator = new CarSimulator("BMW", 6, 3.5, "gold");
    }

    final private CarBuilder carBuilder;
    final private Car car;
    public CarSimulator(String model, int number,  double power, String wheelMaterial) {
        car = new Car(model, number, power, wheelMaterial);
        carBuilder = new CarBuilder(model, number, power, wheelMaterial);
    }
}