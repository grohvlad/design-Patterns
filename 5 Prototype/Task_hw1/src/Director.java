public class Director {

    public Car create_Hundai_Accent_2010(){
        CarBuilder builder = new CarBuilder();
        BodyBuilder bodyBuilder = new BodyBuilder();

        Body body = bodyBuilder
                .setType(Body.BodyType.Sedan)
                .set_4_doors()
                .setSeats(5)
                .build();

        Car result = builder
                .setColor("White")
                .setBody(body)
                .setMotor(new Motor(Motor.MotorType.Gasoline,1.4F,95))
                .setTransmission(new Transmission(Transmission.TransmissionType.Manual,5))
                .build();
        return result;
    }

    public Car create_Volkswagen_Amarok(){
        CarBuilder builder = new CarBuilder();
        BodyBuilder bodyBuilder = new BodyBuilder();

        Body body = bodyBuilder
                .setType(Body.BodyType.Pickup)
                .setSeats(5)
                .set_4_doors()
                .build();

        Car result = builder
                .setBody(body)
                .setMotor(new Motor(Motor.MotorType.Diesel,2.0F,140))
                .setTransmission(new Transmission(Transmission.TransmissionType.Manual,6))
                .setColor("White")
                .build();

        return result;
    }

    public Car create_Smart_Roadster(){
        CarBuilder builder = new CarBuilder();
        BodyBuilder bodyBuilder = new BodyBuilder();

        Body body = bodyBuilder
                .setType(Body.BodyType.Roadster)
                .set_2_doors()
                .setSeats(2)
                .build();

        Car result = builder
                .setBody(body)
                .setMotor(new Motor(Motor.MotorType.Gasoline,0.7F,60))
                .setTransmission(new Transmission(Transmission.TransmissionType.Manual,6))
                .setColor("Black")
                .build();

        return result;
    }

    public Car create_Volkswagen_T4(){
        CarBuilder builder = new CarBuilder();
        BodyBuilder bodyBuilder = new BodyBuilder();

        Body body = bodyBuilder
                .setType(Body.BodyType.Minivan)
                .set_3_doors()
                .setSeats(8)
                .build();

        Car result = builder
                .setBody(body)
                .setMotor(new Motor(Motor.MotorType.Diesel,2.4F,78))
                .setTransmission(new Transmission(Transmission.TransmissionType.Manual,6))
                .setColor("Black")
                .build();

        return result;
    }
}
