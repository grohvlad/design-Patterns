
// Інтерфейс митниця
public interface Customs {
    int vehiclePrice(Auto auto); // розрахувати ціну автомобіля
    int tax(Auto auto);          // розрахувати варність розмитнення автомобіля
    String carInfo(Auto auto);
}