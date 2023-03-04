import java.util.ArrayList;

public class CarBuilder {
    private String color = "None";
    private Body body = (new BodyBuilder()).build();
    private Motor motor = new Motor(
            Motor.MotorType.None,
            0.0F,
            0

    );
    private Transmission transmission = new Transmission(
            Transmission.TransmissionType.None,
            0
    );

    /////////////////////////////////////////////////////////////
    // Builder methods
    /////////////////////////////////////////////////////////////
    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder setBody(Body body) {
        this.body = body;
        return this;
    }

    public CarBuilder setMotor(Motor motor) {
        this.motor = motor;
        return this;
    }

    public CarBuilder setTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }
    public Car build(){
        return new Car(this.color, this.body, this.motor, this.transmission);
    }
}
