import java.util.ArrayList;

public class Body {
    enum BodyType{
        Sedan,
        Pickup,
        Coupe,
        Minivan,
        Roadster,
        None
    }
    private BodyType type;
    private ArrayList<Door> doors;
    private ArrayList<Seat> seats;

    public Body(BodyType type, ArrayList<Door> doors, ArrayList<Seat> seats) {
        this.type = type;
        this.doors = doors;
        this.seats = seats;
    }

    @Override
    public String toString(){
        return type.toString();
    }

    public void showSalon(){
        System.out.println("This  " + this.type + " can pick up up to " + numOfFreeSeats() + " passengers");
    }

    private int numOfDoors(){
        return doors.size();
    }
    public int numOfSeats(){
        return seats.size();
    }

    public int numOfFreeSeats(){
        int res = 0;
        for(Seat seat: seats){
            if(seat.isSeatFree()) res++;
        }
        return res;
    }
    public void fillSeats(int numberOfPassengers){
        int n = numberOfPassengers;
        for(Seat seat: seats){
            if (seat.isSeatFree()){
                seat.takeTheSeat();
                n--;
                if(n == 0) break;
            }
        }
    }

    public void leaveSeats(int numberOfPassengers){
        int n = numberOfPassengers;
        for(Seat seat: seats){
            if (!seat.isSeatFree()){
                seat.leftTheSeat();
                n--;
                if(n == 0) break;
            }
        }
    }
}
