public class Door{
    enum Place{
        FRONT_LEFT,
        FRONT_RIGHT,
        BACK_LEFT,
        BACK_RIGHT
    }
    private boolean isClosed;
    Place place;

    public Door(Place place) {
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

    /////////////////////////////////////////////////////////////
    // cx.Prototype methods
    /////////////////////////////////////////////////////////////
    public Door(Door other){
        this.place = other.place;
        this.isClosed = other.isClosed;
    }

    public Door clone(){
        return new Door(this);
    }
}
