public class Auto {
    enum Type{
        Truck,
        Car
    }
    final public int age;           // вік автомобіля в роках
    final public String model;      // марка автомобіля
    final public float damage;   // ступінь пошкоджень автомобіля після ДТП
    final public int mileage;       // пробіг автомобіля в кілометрах
    final public Type type;

    public Auto(int age, String model, float damage, int mileage, Type type) {
        this.age = age;
        this.model = model;
        this.damage = damage;
        this.mileage = mileage;
        this.type = type;
    }
}