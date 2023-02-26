package com.grohvlad.factory;

import com.grohvlad.marks.volvo.*;
import com.grohvlad.transport.*;

import java.util.HashMap;
import java.util.Map;

public class VolvoFactory extends TransportFactory {
    Map<String, Map<String,Integer>> Products = new HashMap<>(){{
        put("Bus", new HashMap<>(){{
            put("cost", 6_000_000);
            put("usage cost", 20);
        }});
        put("Tram", new HashMap<>(){{
            put("cost", 10_000_000);
            put("usage cost", 7);
        }});
        put("Trolleybus", new HashMap<>(){{
            put("cost", 7_000_000);
            put("usage cost",13);
        }});
    }};

    @Override
    protected Bus buyBus(){
        return new VolvoBus( Products.get("Bus").get("cost"), Products.get("Bus").get("usage cost"));
    }
    protected  Tram buyTram(){
        return new VolvoTram( Products.get("Tram").get("cost"), Products.get("Tram").get("usage cost"));
    }
    protected  Trolleybus buyTrolleybus(){
        return new VolvoTrolleybus( Products.get("Trolleybus").get("cost"), Products.get("Trolleybus").get("usage cost"));
    }
}
