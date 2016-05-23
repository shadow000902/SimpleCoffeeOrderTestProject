package com.alexzh.simplecoffeeorder.utils;

import com.alexzh.simplecoffeeorder.model.Coffee;

import java.util.HashMap;

public class CoffeeOrderUtils {

    public static Coffee getCoffeeByPosition(HashMap<Coffee, Integer> orderedHashMap, int position) {
        int interactionPosition = 0;
        for (Coffee key : orderedHashMap.keySet()) {
            if (interactionPosition == position) {
                return  key;
            }
            interactionPosition++;
        }
        return null;
    }

    public static int getCountByCoffee(HashMap<Coffee, Integer> orderedHashMap, Coffee coffee) {
        for (Coffee key : orderedHashMap.keySet()) {
            if (key.equals(coffee)) {
                return  orderedHashMap.get(key);
            }
        }
        return 0;
    }
}