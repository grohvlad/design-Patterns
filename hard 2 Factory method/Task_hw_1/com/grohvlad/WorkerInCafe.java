package com.grohvlad;
import com.grohvlad.coffe.*;

import java.util.ArrayList;
import java.util.Map;

public interface WorkerInCafe {
    ArrayList<Coffee> Order (Map<String, Integer> order);
    void getPaid();
    void payForRent();
    Integer checkBalance();
    void updateMenu();
}
