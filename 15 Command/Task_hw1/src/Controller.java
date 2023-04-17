import java.util.ArrayList;

public class Controller {

    private Command commandOn;

    private Command commandOff;

    public void setCommandOn(Command commandOn) {
        this.commandOn = commandOn;
    }

    public void setCommandOff(Command commandOff) {
        this.commandOff = commandOff;
    }

    public void on(Lamp lamp) {
        if (commandOn != null)
            commandOn.execute(lamp);
    }

    public void off(Lamp lamp) {
        if (commandOff != null)
            commandOff.execute(lamp);
    }

    public void on(ArrayList<Lamp> lamps) {
        if (commandOn != null)
            for(Lamp lamp: lamps){
                commandOn.execute(lamp);
            }
    }

    public void off(ArrayList<Lamp> lamps) {
        if (commandOff != null)
            for(Lamp lamp: lamps){
                commandOff.execute(lamp);
            }
    }
}