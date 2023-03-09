import com.vehiclecalculator.*;

public class Main {

    public static void main(String[] args) {

        Vehicle vehicle = new Car(2, "Audi", 0.5F);
        VehicleCalculator calculator = new CarCalculator();
        calculator.setVehicle(vehicle);
        System.out.println("Library calculates cost: " + calculator.calculatePrice());

        Auto auto = new Auto(2, "Audi", 0.5F, 200_000, Auto.Type.Car);
        Customs custom = new CustomsAdapter();
        System.out.println(custom.carInfo(auto));

        Auto auto2 = new Auto(2, "Audi", 0.5F, 200_000, Auto.Type.Truck);
        System.out.println(custom.carInfo(auto2));
    }
}