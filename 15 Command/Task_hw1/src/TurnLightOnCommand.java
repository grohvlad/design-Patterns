public class TurnLightOnCommand implements Command {
    @Override
    public void execute(Lamp lamp) {
        lamp.lightOn();
    }
}