import java.util.ArrayList;

public class RemoteController {
    void deviceOn(Device device){
        System.out.printf(device.getName() + " ");
        device.on();
    }
    void deviceOff(Device device){
        System.out.printf(device.getName() + " ");
        device.off();
    }
    void deviceVolumeUp(Device device){
        System.out.printf(device.getName() + " ");
        device.volumeUp();
    }
    void deviceVolumeDown(Device device){
        System.out.printf(device.getName() + " ");
        device.volumeDown();
    }
    void deviceNextChanel(Device device){
        System.out.printf(device.getName() + " ");
        device.nextChanel();
    }
    void devicePrevChanel(Device device){
        System.out.printf(device.getName() + " ");
        device.prevChanel();
    }

    void devisesOn(ArrayList<Device> devices){
        for(Device device: devices){
            System.out.printf(device.getName() + " ");
            if(!device.on()){
                System.out.println("is already on");
            }
        }
    }
    void devicesOff(ArrayList<Device> devices){
        for(Device device: devices){
            System.out.printf(device.getName() + " ");
            if(!device.off()){
                System.out.println("is already off");
            }
        }
    }
}
