import java.util.ArrayList;

public class Client {
    enum light{ Kitchen, Hall, Bedroom, Bathroom, Universal}
    public static void main(String[] args) {


        Lamp kitchenLamp = new Lamp(light.Kitchen);
        Lamp hallLamp = new Lamp(light.Hall);
        Lamp bedroomLamp = new Lamp(light.Bedroom);
        Lamp bathroomLamp = new Lamp(light.Bathroom);
        ArrayList<Lamp> allLamps = new ArrayList<>(){{
            add(kitchenLamp);
            add(hallLamp);
            add(bedroomLamp);
            add(bathroomLamp);
        }};

        Command commandOn = new TurnLightOnCommand();
        Command commandOff = new TurnLightOffCommand();

        Controller controller = new Controller();
        controller.setCommandOn(commandOn);
        controller.setCommandOff(commandOff);

        controller.on(kitchenLamp);
        controller.on(kitchenLamp);


//        Controller controllerKitchenLamp = new Controller();
//        Controller controllerHallLamp = new Controller();
//        Controller controllerBedroomLamp = new Controller();
//        Controller controllerBathroomLamp = new Controller();
//        Controller controllerUniversal = new Controller();

        //Simulation
        controller.on(kitchenLamp);
        controller.on(hallLamp);
        controller.on(bedroomLamp);

        controller.off(kitchenLamp);
        controller.off(hallLamp);
        controller.off(bedroomLamp);

        controller.on(bedroomLamp);
        controller.on(bathroomLamp);

        System.out.println();
        controller.off(allLamps);
        System.out.println();
        controller.on(allLamps);
        System.out.println();
        controller.off(allLamps);

    }
}
