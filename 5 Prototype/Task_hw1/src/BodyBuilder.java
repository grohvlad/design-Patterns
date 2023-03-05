import java.util.ArrayList;

public class BodyBuilder { //Arnold Svarceneger
    private ArrayList<Door> doors = new ArrayList<>();
    private ArrayList<Seat> seats = new ArrayList<>();
    private Body.BodyType type = Body.BodyType.None;
    private Seat.Material material = Seat.Material.Cloth;


    /////////////////////////////////////////////////////////////
    // Builder methods
    /////////////////////////////////////////////////////////////

    public BodyBuilder setDoor(Door.Place doorPlace) {
        this.doors.add(new Door(doorPlace));
        return this;
    }
    public BodyBuilder set_4_doors(){
        this.doors.add(new Door(Door.Place.FRONT_LEFT));
        this.doors.add(new Door(Door.Place.FRONT_RIGHT));
        this.doors.add(new Door(Door.Place.BACK_LEFT));
        this.doors.add(new Door(Door.Place.BACK_RIGHT));
        return this;
    }
    public BodyBuilder set_3_doors(){
        this.doors.add(new Door(Door.Place.FRONT_LEFT));
        this.doors.add(new Door(Door.Place.FRONT_RIGHT));
        this.doors.add(new Door(Door.Place.BACK_RIGHT));
        return this;
    }
    public BodyBuilder set_2_doors(){
        this.doors.add(new Door(Door.Place.FRONT_LEFT));
        this.doors.add(new Door(Door.Place.FRONT_RIGHT));
        return this;
    }

    public BodyBuilder setSeat(Seat.Place seatPlace, Seat.Material material) {
        this.seats.add( new Seat(seatPlace, material));
        return this;
    }

    public BodyBuilder setSeats(int number) {
        if(number == 2 || number == 5 || number == 8){
            this.seats.add(new Seat(Seat.Place.FRONT_LEFT, material));
            this.seats.add(new Seat(Seat.Place.FRONT_RIGHT, material));
            if(number == 2) return this;
            this.seats.add(new Seat(Seat.Place.BACK_LEFT, material));
            this.seats.add(new Seat(Seat.Place.BACK_RIGHT, material));
            this.seats.add(new Seat(Seat.Place.BACK_MIDDLE, material));
            if(number == 5) return this;
            this.seats.add(new Seat(Seat.Place.CENTER_LEFT, material));
            this.seats.add(new Seat(Seat.Place.CENTER_RIGHT, material));
            this.seats.add(new Seat(Seat.Place.CENTER_MIDDLE, material));
            if(number == 8) return this;
        }
        System.out.println("Unique car");
        return this;
    }

    public BodyBuilder setType(Body.BodyType type) {
        this.type = type;
        return this;
    }

    public Body build(){
        return new Body( type, doors, seats);
    }
}
