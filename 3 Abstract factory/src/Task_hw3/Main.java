//package Task_hw3;
//import Task_hw3.grohvlad.coffeeMachineMaker.*;
//import Task_hw3.grohvlad.coffee.*;
//
//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Map<String, CoffeeMachineMaker> allFactories = new HashMap<>() {{
//            put("Delonghi", new DelonghiCoffeeMachineMaker(24_000, 240, 50 + 24 + 10));
//            put("Philips", new PhilipsCoffeeMachineMaker(20_000, 200, 50 + 20 + 20));
//            put("Saeco", new SaecoCoffeeMachineMaker(32_000, 320, 50 + 32 + 15));
//            put("Siemens", new SiemensCoffeeMachineMaker(19_000, 190, 50 + 19 + 7));
//        }};
//
//        CoffeeMachineMaker factory;
//
//        Main cafe = new Main();
//
//    }
//
//    private final int N = 60;  // орієнтована кількість днів для покриття покупки
//    private final int wantToEarnPerMonth = 15_000;
//    private final int rentCost = 10_000;
//    private final int workerSalary = 600;
//    private int startMoney = 0;
//    private int extra = 10;
//
//    public void workFor_n_Days(Integer n) {
//        Map<String, Integer> OPD;
//
//        for(Integer day = 1; day <= n; day++){
//            if (n%28 == 0){payForRent();}
//            OPD = ordersPerDay();
//
//            Order(OPD);
//            payToWorker();
//        }
//    }
//
//    private void payForRent(){
//        if(startMoney > rentCost){
//            startMoney -= rentCost;
//        } else System.out.println("You have not enough money for rent");
//    }
//    private void payToWorker(int value){
//        if(startMoney > value){
//            startMoney -= value;
//        } else System.out.println("You have not enough money for rent");
//    }
//
//    private ArrayList<Coffee> Order(Map<String, Integer> order) {
//        ArrayList<Coffee> drinks = makeOrder(order);
//        if (drinks != null) {
//            startMoney += calculateCostOfOrder(order);
//            return drinks;
//        } else {
//            System.out.println("Problems with order");
//            return new ArrayList();
//        }
//    }
//
//    private ArrayList<Coffee> makeOrder(Map<String, Integer> order, CoffeeMachineMaker coffeeMachine) {
//        ArrayList<Coffee> coffeeForOrder = new ArrayList<>();
//
//        for(String nameOfCoffee: order.keySet()){
//            for (int i = 0; i < order.get(nameOfCoffee); i++) {
//                Coffee currentCoffee;
//
//                switch (nameOfCoffee){
//                    case "Americano": currentCoffee = coffeeMachine.makeAmericano(); break;
//                    case "Cappuccino": currentCoffee = coffeeMachine.makeCappuccino(); break;
//                    case "Espresso": currentCoffee = coffeeMachine.makeEspresso(); break;
//                    case "Late": currentCoffee = coffeeMachine.makeLatte(); break;
//                    default:
//                        System.out.println("Cafe doesn't do this coffee");
//                }
//
//                coffeeForOrder.add(currentCoffee);
//            }
//        }
//
//        data.putCash(calculateCostOfOrder(order) - calculateSelfCostOfOrder(coffeeForOrder));
//        return coffeeForOrder;
//    }
//
//    private Integer calculateCostOfOrder(Map<String, Integer> order){
//        int finalCost = 0;
//        int costPerDrink;
//
//        for(String itemFromOrder: order.keySet()){
//            costPerDrink = data.drinksCost(itemFromOrder);
//            finalCost += costPerDrink * order.get(itemFromOrder);
//        }
//        return finalCost;
//    }
//
//    private Integer calculateSelfCostOfOrder(ArrayList<Coffee> coffeeForOrder){
//        int finalCost = 0;
//        for (Coffee coffee: coffeeForOrder){
//            finalCost += coffee.getSelfCost();
//        }
//        return finalCost;
//    }
//
//    ///////////////////////////////////////////////////
//    //Generate orders
//    ///////////////////////////////////////////////////
//    private final int averageNumberOfVisitors = 40;
//    private final int deviationNumberOfVisitors = 10;
//    private final int averageNumberOfDrinksInCheck = 2;
//    private final float deviationNumberOfDrinksInCheck = 0.2F;
//    private Random random = new Random();
//
//    private Map<String,Integer> ordersPerDay(ArrayList<String> availableDrinks){
//        Map<String, Integer> ordersPerDayList = new HashMap<>();
//        int numberOfConsumers = (int) (random.nextGaussian()* deviationNumberOfVisitors)+averageNumberOfVisitors;
//        int numberOfDrinks = (int)(numberOfConsumers*(random.nextGaussian()*0.5+averageNumberOfDrinksInCheck));
//
//        ArrayList<String> menuDrinks = new ArrayList<>(availableDrinks);
//        for(int i = menuDrinks.size(); i>1 ; i--){
//            int a = (int) (numberOfDrinks/i);
//            int forThisDrink = (int)(random.nextGaussian()*deviationNumberOfDrinksInCheck*a) + a;
//            numberOfDrinks -= forThisDrink;
//
//            ordersPerDayList.put(menuDrinks.get(menuDrinks.size()-i), forThisDrink);
//        }
//        ordersPerDayList.put(menuDrinks.get(menuDrinks.size()-1),numberOfDrinks);
//        return ordersPerDayList;
//    }
//}
