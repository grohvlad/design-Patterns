package Task_hw2.grohvlad.factory;

import Task_hw2.grohvlad.marks.skoda.*;
import Task_hw2.grohvlad.transport.*;

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
    protected  Tram buyTram(){
        return new SkodaTram( Products.get("Tram").get("cost"), Products.get("Tram").get("usage cost"));
    }
    protected  Trolleybus buyTrolleybus(){
        return new SkodaTrolleybus( Products.get("Trolleybus").get("cost"), Products.get("Trolleybus").get("usage cost"));
    }
}
