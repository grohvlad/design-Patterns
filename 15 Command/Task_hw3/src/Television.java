public class Television implements Device {

    private int volume;
    private int chanel;
    private boolean isOn;
    private final String name = "TV";

    public Television() {
        this.isOn = false;
        this.volume = 50;
        this.chanel = 1;
    }

    @Override
    public boolean on() {
        if (isOn) {
            return false;
        }
        System.out.println("device is on");
        isOn = true;
        return true;
    }

    @Override
    public boolean off() {
        if (!isOn) {
            return false;
        }
        System.out.println("device is off");
        isOn = false;
        return true;
    }

    @Override
    public void volumeUp() {
        if (!isOn) {
            return;
        }
        volume++;
        System.out.println("Volume = " + volume);
    }

    @Override
    public void volumeDown() {
        if (!isOn) {
            return ;
        }
        volume--;
        System.out.println("Volume = " + volume);
    }

    @Override
    public void nextChanel() {
        if (!isOn) {
            return;
        }
        chanel++;
        System.out.println("Chanel = " + chanel);
    }

    @Override
    public void prevChanel() {
        if (!isOn) {
            return;
        }
        chanel--;
        System.out.println("Chanel = " + chanel);
    }

    @Override
    public String getName() {
        return name;
    }
}
