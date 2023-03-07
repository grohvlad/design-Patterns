public class Main {
    public static void main(String[] args) {
        Director carMaker = Director.getInstance();

        Car car = carMaker.create_Hundai_Accent_2010();
        car.ride();
        car.showSalon();
        car.getIn(1); //You get in your new (2010) Hundai and as successful person you go for taxi work
        car.getIn(7); //You have just bought the car, so you need much money and try to take more passengers thn you can
        car.showSalon();            //It hasn't worked so you ride alone
        car.getIn(3); // You pick up 3 humans
        car.showSalon();            // There is still 1 free seat
        car.getOut(5); // Some test
        car.getOut(3); // and the passengers are gone, you are alone again with 200 UAH great time to overthinking
        car.showSalon();

        System.out.println("");
        Car car2 = carMaker.create_Volkswagen_T4();
        car2.ride();
        car2.showSalon();
    }

}