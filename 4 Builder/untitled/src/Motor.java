public class Motor {
    enum MotorType{
        Gasoline,
        Diesel,
        None
    }
    private MotorType fuel;
    private float volume;
    private int horsePower;

    public Motor(MotorType fuel, float volume, int horsePower) {
        this.fuel = fuel;
        this.volume = volume;
        this.horsePower = horsePower;
    }

    public MotorType getFuel() {
        return fuel;
    }

    public float getVolume() {
        return volume;
    }

    public int getHorsePower() {
        return horsePower;
    }
}
