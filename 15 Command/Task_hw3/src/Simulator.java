import java.util.ArrayList;

public class Simulator {
    public static void main(String[] args) {

        Device device_radio = new Radio();
        Device device_tw = new Television();

        RemoteController controller = new RemoteController();

        controller.deviceOn(device_tw);

        for (int i = 0; i < 5; i++) {
            controller.deviceNextChanel(device_tw);
        }
        controller.deviceVolumeUp(device_tw);

        controller.deviceVolumeUp(device_tw);
        controller.deviceVolumeUp(device_tw);

        controller.devicePrevChanel(device_tw);

        controller.deviceVolumeDown(device_tw);

        controller.deviceOn(device_radio);

        controller.devicesOff(new ArrayList<>(){{add(device_tw);add(device_radio);}});

        controller.devicesOff(new ArrayList<>(){{add(device_tw);add(device_radio);}});

    }
}
