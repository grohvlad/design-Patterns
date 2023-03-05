public class Main {
    public static void main(String[] args) {
        Director carMaker = new Director();

        Car car1 = carMaker.create_Smart_Roadster();
        car1.showSalon();
        Car car2 = car1.clone();
        car2.showSalon();
        car2.changeSeatMaterial(Seat.Material.Alcantara);
        car2.getIn(1);

        car1.showSalon();
        car2.showSalon();
    }

}