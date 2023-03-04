public class Door {
    enum Place{
        FRONT_LEFT,
        FRONT_RIGHT,
        BACK_LEFT,
        BACK_RIGHT
    }
    private boolean isClosed;
    Door.Place place;

    public Door(Door.Place place) {
        this.place = place;
        this.isClosed = true;
    }
    public void openTheDoor(){
        this.isClosed = false;
    }
    public void closeTheDoor(){
        this.isClosed = true;
    }
    public boolean isDoorClosed(){ return this.isClosed;}
}
