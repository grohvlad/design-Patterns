import com.grohvlad.coffe.Coffee;

import java.util.ArrayList;
import java.util.Map;

public interface WorkerInCafe {
    ArrayList<Coffee> Order (Map<String, Integer> order);
    void getPaid();
    void payForRent();
}
