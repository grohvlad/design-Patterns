public class Seat {
    enum Place{
        FRONT_LEFT,
        FRONT_RIGHT,
        BACK_LEFT,
        BACK_RIGHT,
        BACK_MIDDLE,
        CENTER_LEFT,
        CENTER_RIGHT,
        CENTER_MIDDLE
    }
    private boolean isFree;
    Seat.Place place;

    public Seat(Seat.Place place) {
        this.place = place;
        this.isFree = true;
    }
    public void takeTheSeat(){
        this.isFree = false;
    }
    public void leftTheSeat(){
        this.isFree = true;
    }
    public boolean isSeatFree(){ return this.isFree;}
}
