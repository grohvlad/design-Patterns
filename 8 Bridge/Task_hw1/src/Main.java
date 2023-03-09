import com.grohvlad.bevelage.*;
import com.grohvlad.topping.*;

public class Main {
    public static void main(String[] args) {
        IBeverage beverage1 = new Chocolate( new Canella());
        beverage1.prepare();
        System.out.println(beverage1.cost());
        beverage1.drink();

        System.out.println();

        IBeverage beverage2 = new Tea( new Rum());
        beverage2.prepare();
        System.out.println(beverage2.cost());
        beverage2.drink();
    }
}