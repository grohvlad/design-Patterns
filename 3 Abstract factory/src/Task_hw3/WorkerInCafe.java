package Task_hw3;

import Task_hw3.grohvlad.coffee.Coffee;

import java.util.ArrayList;
import java.util.Map;

public interface WorkerInCafe {
    ArrayList<Coffee> Order (Map<String, Integer> order);
    void getPaid();
    void payForRent();
}
