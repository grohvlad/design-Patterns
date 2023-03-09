import com.vehiclecalculator.*;
public class CustomsAdapter implements Customs{
    @Override
    public int vehiclePrice(Auto auto) {
        Vehicle vehicle = new Vehicle(auto.age, auto.model, auto.damage, auto.mileage);
        VehicleCalculator calculator = null;
        switch (auto.type){
            case Car -> calculator = new CarCalculator();
            case Truck -> calculator = new TruckCalculator();
            default -> System.out.println("There is no such type in database");
        }
        calculator.setVehicle(vehicle);

        String priceInUsdStr = calculator.calculatePrice();
        int priceInUSD = Integer.parseInt(priceInUsdStr.replaceAll("\\D", ""));
        int priceInUAH = (int)(priceInUSD*Singleton.getInstance().getExchangeRate());
        return priceInUAH;
    }

    @Override
    public int tax(Auto auto) {
        return (int) (vehiclePrice(auto)*0.05F);
    }

    @Override
    public String carInfo(Auto auto) {
        int price = vehiclePrice(auto);
        int taxes = tax(auto);
        return "This " + auto.model + "("+ auto.type.name() + ")"  + " costs " + price + "UAH with taxes (" + taxes + "UAH) costs " + (price+taxes) + "UAH" + "\nfor current exchange rate: " + Singleton.getInstance().getExchangeRate();
    }
}
