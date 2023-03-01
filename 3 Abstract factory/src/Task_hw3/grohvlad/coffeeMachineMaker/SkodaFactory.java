package Task_hw3.grohvlad.coffeeMachineMaker;

import Task_hw3.grohvlad.coffeeMachine.saeco.SkodaBus;
import Task_hw3.grohvlad.coffeeMachine.saeco.SkodaTram;
import Task_hw3.grohvlad.coffeeMachine.saeco.SkodaTrolleybus;
import Task_hw3.grohvlad.coffee.Bus;
import Task_hw3.grohvlad.coffee.Tram;
import Task_hw3.grohvlad.coffee.Trolleybus;

import java.util.HashMap;
import java.util.Map;

public class SkodaFactory extends TransportFactory {
    Map<String, Map<String,Integer>> Products = new HashMap<>(){{
        put("Bus", new HashMap<>(){{
            put("cost", 4_500_000);
            put("usage cost", 25);
        }});
        put("Tram", new HashMap<>(){{
            put("cost", 9_000_000);
            put("usage cost", 8);
        }});
        put("Trolleybus", new HashMap<>(){{
            put("cost", 6_800_000);
            put("usage cost", 12);
        }});
    }};

    @Override
    protected Bus buyBus(){
        return new SkodaBus( Products.get("Bus").get("cost"), Products.get("Bus").get("usage cost"));
    }
    protected Tram buyTram(){
        return new SkodaTram( Products.get("Tram").get("cost"), Products.get("Tram").get("usage cost"));
    }
    protected Trolleybus buyTrolleybus(){
        return new SkodaTrolleybus( Products.get("Trolleybus").get("cost"), Products.get("Trolleybus").get("usage cost"));
    }
}
