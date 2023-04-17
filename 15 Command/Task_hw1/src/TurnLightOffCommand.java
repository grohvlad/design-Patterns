public class TurnLightOffCommand implements Command {
    @Override
    public void execute(Lamp lamp) {
        lamp.lightOff();
    }
}