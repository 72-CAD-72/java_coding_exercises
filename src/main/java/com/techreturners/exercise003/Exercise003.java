package com.techreturners.exercise003;

import java.util.HashMap;
import java.util.Map;

public class Exercise003 {

    // simple array -> probably would be passed in extending Exercise003
    private String[] flavors = {"Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet"};

    // use Map for ease / speed of retrival
    private Map<String, Integer> flavorMap;

    public Exercise003() {

        flavorMap = new HashMap<String, Integer>();

        for (int i=0;i < flavors.length; i++) {
            flavorMap.put(flavors[i], i);
        }
    }

    int getIceCreamCode(String iceCreamFlavour) {
        return flavorMap.getOrDefault(iceCreamFlavour, -1);
    }

    String[] iceCreamFlavours() {
        return flavors;
    }

}
