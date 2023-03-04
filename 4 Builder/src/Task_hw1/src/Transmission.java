public class Transmission {
    enum TransmissionType{
        Robot,
        Auto,
        Manual,
        None
    }
    private TransmissionType type;
    private int numberOfGears;

    public Transmission(TransmissionType type, int numberOfGears) {
        this.type = type;
        this.numberOfGears = numberOfGears;
    }

    @Override
    public String toString(){
        return numberOfGears + " steps " + type.toString();
    }
}
