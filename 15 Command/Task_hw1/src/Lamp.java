public class Lamp {

    final private Client.light name;
    private boolean isLightOn;

    public Lamp(Client.light name) {
        this.name = name;
        this.isLightOn = false;
    }

    public Lamp() {
        this(Client.light.Universal);
    }

    public void lightOn() {
        if (isLightOn) {
            return;
        }
        if(name.equals(Client.light.Universal)){

        } else{
            System.out.println(name + ": Light is on");
        }
        isLightOn = true;
    }

    public void lightOff() {
        if (!isLightOn) {
            return;
        }
        System.out.println(name + ": Light is off");
        isLightOn = false;
    }
}
