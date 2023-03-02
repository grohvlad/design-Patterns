package Task_hw3;
import Task_hw3.grohvlad.coffeeMachineMaker.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        final int N = 60;  // орієнтована кількість днів для покриття покупки
        final int wantToEarnPerMonth = 10_000;

        Map<String, CoffeeMachineMaker> allFactories = new HashMap<>() {{
            put("Delonghi", new DelonghiCoffeeMachineMaker(24_000, 240, 50 + 24 + 15));
            put("Philips", new PhilipsCoffeeMachineMaker(20_000, 200, 50 + 20 + 15));
            put("Saeco", new SaecoCoffeeMachineMaker(32_000, 320, 50 + 32 + 15));
            put("Siemens", new SiemensCoffeeMachineMaker(19_000, 190, 50 + 19 + 15));
        }};

        CoffeeMachineMaker factory;

    }




    public void workFor_n_Days(Integer n) {
        Map<String, Integer> OPD;

        for(Integer day = 1; day <= n; day++){
            if (n%28 == 0){payForRent();}
            OPD = ordersPerDay();

            Order(OPD);
            payToWorker();
        }
    }

    ///////////////////////////////////////////////////
    //Generate orders
    ///////////////////////////////////////////////////
    private final int averageNumberOfVisitors = 40;
    private final int deviationNumberOfVisitors = 10;
    private final int averageNumberOfDrinksInCheck = 2;
    private final float deviationNumberOfDrinksInCheck = 0.2F;
    private Random random = new Random();

    private Map<String,Integer> ordersPerDay(ArrayList<String> availableDrinks){
        Map<String, Integer> ordersPerDayList = new HashMap<>();
        int numberOfConsumers = (int) (random.nextGaussian()* deviationNumberOfVisitors)+averageNumberOfVisitors;
        int numberOfDrinks = (int)(numberOfConsumers*(random.nextGaussian()*0.5+averageNumberOfDrinksInCheck));

        ArrayList<String> menuDrinks = new ArrayList<>(availableDrinks);
        for(int i = menuDrinks.size(); i>1 ; i--){
            int a = (int) (numberOfDrinks/i);
            int forThisDrink = (int)(random.nextGaussian()*deviationNumberOfDrinksInCheck*a) + a;
            numberOfDrinks -= forThisDrink;

            ordersPerDayList.put(menuDrinks.get(menuDrinks.size()-i), forThisDrink);
        }
        ordersPerDayList.put(menuDrinks.get(menuDrinks.size()-1),numberOfDrinks);
        return ordersPerDayList;
    }
}
