import java.util.ArrayList;

public class BodyBuilder { //Arnold Svarceneger
    private ArrayList<Door> doors = new ArrayList<>();
    private ArrayList<Seat> seats = new ArrayList<>();
    private Body.BodyType type = Body.BodyType.None;


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

    public BodyBuilder setSeat(Seat.Place seatPlace) {
        this.seats.add( new Seat(seatPlace));
        return this;
    }
    public BodyBuilder set_8_seats(){
        this.seats.add(new Seat(Seat.Place.FRONT_LEFT));
        this.seats.add(new Seat(Seat.Place.FRONT_RIGHT));
        this.seats.add(new Seat(Seat.Place.CENTER_LEFT));
        this.seats.add(new Seat(Seat.Place.CENTER_RIGHT));
        this.seats.add(new Seat(Seat.Place.CENTER_MIDDLE));
        this.seats.add(new Seat(Seat.Place.BACK_LEFT));
        this.seats.add(new Seat(Seat.Place.BACK_RIGHT));
        this.seats.add(new Seat(Seat.Place.BACK_MIDDLE));
        return this;
    }
    public BodyBuilder set_5_seats(){
        this.seats.add(new Seat(Seat.Place.FRONT_LEFT));
        this.seats.add(new Seat(Seat.Place.FRONT_RIGHT));
        this.seats.add(new Seat(Seat.Place.BACK_LEFT));
        this.seats.add(new Seat(Seat.Place.BACK_RIGHT));
        this.seats.add(new Seat(Seat.Place.BACK_MIDDLE));
        return this;
    }
    public BodyBuilder set_2_seats(){
        this.seats.add(new Seat(Seat.Place.FRONT_LEFT));
        this.seats.add(new Seat(Seat.Place.FRONT_RIGHT));
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
