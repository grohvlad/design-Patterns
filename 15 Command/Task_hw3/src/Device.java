public interface Device {
    boolean on();
    boolean off();
    void volumeUp();
    void volumeDown();
    void nextChanel();
    void prevChanel();
    String getName();
}
