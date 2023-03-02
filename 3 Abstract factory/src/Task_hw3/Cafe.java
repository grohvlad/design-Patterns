package Task_hw3;

import Task_hw3.grohvlad.coffeeMachineMaker.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Cafe{

    public static void main(String[] args){

        Map<String, CoffeeMachineMaker> allFactories = new HashMap<>() {{
            put("Delonghi", new DelonghiCoffeeMachineMaker(24_000, 240, 50 + 24 + 10));
            put("Philips", new PhilipsCoffeeMachineMaker(20_000, 200, 50 + 20 + 20));
            put("Saeco", new SaecoCoffeeMachineMaker(32_000, 320, 50 + 32 + 15));
            put("Siemens", new SiemensCoffeeMachineMaker(19_000, 190, 50 + 19 + 7));
        }};


        final int N = 60;  // орієнтована кількість днів для покриття покупки
        final int wantToEarnPerMonth = 15_000;
        final int rentCost = 10_000;
        final int workerSalary = 600;
        int startMoney = 0;
        int extra = 10;

        for(String coffeeMachineFactory: allFactories.keySet()){
            CoffeeMachineMaker coffeeMachine = allFactories.get(coffeeMachineFactory);

            Cafe cafe = new Cafe(coffeeMachine, workerSalary,startMoney, rentCost);
        }
    }

    private WorkerInCafe worker;
    private Data data;
    private CoffeeMachineMaker coffeeMachine;

    public Cafe(CoffeeMachineMaker coffeeMachine, int workerSalary, int startAmountOfMoney, int rentCost){
        this.data = new Data(startAmountOfMoney, rentCost);
        this.worker = findWorker(data, workerSalary);
        this.coffeeMachine = coffeeMachine;
    }

    private WorkerInCafe findWorker(Data data, Integer payPerDay){
        return new Worker(data, payPerDay);
    }


    public void workFor_n_Days(Integer n) {
        Map<String, Integer> OPD;

        for(Integer day = 1; day <= n; day++){
            if (n%28 == 0){worker.payForRent();}
            OPD = ordersPerDay();

            worker.Order(OPD);
            worker.getPaid();
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

    private Map<String,Integer> ordersPerDay(){
        Map<String, Integer> ordersPerDayList = new HashMap<>();
        int numberOfConsumers = (int) (random.nextGaussian()* deviationNumberOfVisitors)+averageNumberOfVisitors;
        int numberOfDrinks = (int)(numberOfConsumers*(random.nextGaussian()*0.5+averageNumberOfDrinksInCheck));

        ArrayList<String> menuDrinks = new ArrayList<>(data.availableDrinks());
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
