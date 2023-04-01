import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String, WheelFlyweight> wheelCache = new HashMap<>();

    public WheelFlyweight getWheelFlyweight(WheelFlyweight.Material material, WheelFlyweight.Color color){
        String key = material.toString() + color.toString();
        System.out.println(key);
        System.out.println(!wheelCache.containsKey(key));
        if(!wheelCache.containsKey(key)){
            wheelCache.put(key, new WheelFlyweight(material,color));;
        }
        return wheelCache.get(key);
    }

    private Map<String, EngineFlyweight> engineCache = new HashMap<>();

    public EngineFlyweight getEngineFlyweight(EngineFlyweight.Petrol petrol, EngineFlyweight.Power power){
        String key = petrol.toString()+power.toString();
        if(!engineCache.containsKey(key)){
            engineCache.put(key, new EngineFlyweight(petrol, power));
        }
        return engineCache.get(key);
    }

}
