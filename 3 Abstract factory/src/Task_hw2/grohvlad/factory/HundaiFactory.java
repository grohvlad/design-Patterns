package Task_hw2.grohvlad.factory;

import Task_hw2.grohvlad.marks.skoda.*;
import Task_hw2.grohvlad.transport.*;

import java.util.HashMap;
import java.util.Map;

public class HundaiFactory extends TransportFactory {
    Map<String, Map<String,Integer>> Products = new HashMap<>(){{
        put("Bus", new HashMap<>(){{
            put("cost", 5_500_000);
            put("usage cost", 20);
        }});
        put("Tram", new HashMap<>(){{
            put("cost", 9_500_000);
            put("usage cost", 6);
        }});
        put("Trolleybus", new HashMap<>(){{
            put("cost", 7_000_000);
            put("usage cost", 11);
        }});
    }};

    @Override
    protected Bus buyBus(){
        return new SkodaBus( Products.get("Bus").get("cost"), Products.get("Bus").get("usage cost"));
    }
    protected  Tram buyTram(){
        return new SkodaTram( Products.get("Tram").get("cost"), Products.get("Tram").get("usage cost"));
    }
    protected  Trolleybus buyTrolleybus(){
        return new SkodaTrolleybus( Products.get("Trolleybus").get("cost"), Products.get("Trolleybus").get("usage cost"));
    }
}
