package Task_hw3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Menu {
    private Map<String, Integer> menu;
    private int extra = 0;
    public Menu() {
        this.menu = new HashMap<>(){{
            put("Americano", 9);
            put("Cappuccino", 15);
            put("Espresso", 5);
            put("Latte", 12);
        }};
    }
    public void updateMenu(int costChange){
        extra += costChange;
        for(String nameOfDrink: menu.keySet()){
            menu.put(nameOfDrink, menu.get(nameOfDrink)+extra);
        }
    }
    public int drinksCost(String name){
        return menu.get(name);
    }
    public void showMenu(){
        System.out.println(this.menu.toString());}
}
