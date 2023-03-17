import com.grohvlad.beverage.*;
import com.grohvlad.topping.*;

public class Main {

    public static void main(String[] args) {

        Component bev1 = new Espresso();
        bev1 = new SugarTopping(bev1);
        bev1 = new SugarTopping(bev1);
        System.out.println(bev1);

        Component bev2 = new DarkRoast();
        bev2 = new CreamTopping(bev2);
        bev2 = new SugarTopping(bev2);
        bev2 = new SugarTopping(bev2);
        System.out.println(bev2);

        Component bev3 = new DarkRoast();
        bev3 = new CaramelTopping(bev3);
        bev3 = new SugarTopping(bev3);
        System.out.println(bev3);

        Component bev4 = new Decaf();
        bev4 = new MilkTopping(bev4);
        bev4 = new SugarTopping(bev4);
        bev4 = new SugarTopping(bev4);
        System.out.println(bev4);
    }
}
