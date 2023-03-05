public class Transmission{
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

    /////////////////////////////////////////////////////////////
    // cx.Prototype methods
    /////////////////////////////////////////////////////////////
    public Transmission(Transmission other){
        this.type = other.type;
        this.numberOfGears = other.numberOfGears;
    }

    public Transmission clone(){
        return new Transmission(this);
    }
}
