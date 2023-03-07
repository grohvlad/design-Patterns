public class Car {
    private String color;
    private Body body;
    private Motor motor;
    private Transmission transmission;

    public Car(String color, Body body, Motor motor, Transmission transmission) {
        this.color = color;
        this.body = body;
        this.motor = motor;
        this.transmission = transmission;
    }

    public void ride(){
        if(this.body.toString() == "None"){
            System.out.println("The car is not ready to go");
        }
        else {
            System.out.println(this.color + " " + this.body + " goes well with " +
                    this.motor.getVolume() + "l "+ this.motor.getHorsePower() + "hp " +
                    " motor and " + this.transmission + " transmission");
        }
    }

    public void showSalon(){
        body.showSalon();
    }

    public void getIn(int numberOfhumans){
        if(body.numOfFreeSeats() >= numberOfhumans){
            body.fillSeats(numberOfhumans);
        }else {
            System.out.println("Not enough place you need another car");
        }
    }
    public void getOut(int numberOfHumans){
        if(body.numOfSeats() - body.numOfFreeSeats() >= numberOfHumans){
            body.leaveSeats(numberOfHumans);
        }else {
            System.out.println("Not enough humans in the car you need find some)");
        }
    }
}
