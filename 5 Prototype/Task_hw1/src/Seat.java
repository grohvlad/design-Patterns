public class Seat{

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
    enum Material{
        Alcantara,
        Leather,
        Cloth
    }


    private boolean isFree;
    Place place;
    Material material = Material.Cloth;

    public Seat(Place place, Material material) {
        this.place = place;
        this.isFree = true;
        this.material = material;
    }
    public void takeTheSeat(){
        this.isFree = false;
    }
    public void leftTheSeat(){
        this.isFree = true;
    }
    public boolean isSeatFree(){ return this.isFree;}
    public void setMaterial(Material material){
        this.material = material;
    }


    /////////////////////////////////////////////////////////////
    // cx.Prototype methods
    /////////////////////////////////////////////////////////////
    public Seat(Seat other){
        this.place = other.place;
        this.isFree = other.isFree;
        this.material = other.material;
    }

    public Seat clone(){;
        return new Seat(this);
    }
}
