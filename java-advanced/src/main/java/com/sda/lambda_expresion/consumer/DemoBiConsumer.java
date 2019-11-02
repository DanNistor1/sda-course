package com.sda.lambda_expresion.consumer;

import java.util.HashMap;
import java.util.Map;

public class DemoBiConsumer {

    public static void main(String[] args) {

        Map<String, Integer> ages = new HashMap<>();
        ages.put("John", 25);
        ages.put("Freddy", 24);
        ages.put("Samuel", 30);
        // CTRL + D - duplicate line
        // CTRL + Y - delete
        // CTRL + x - cut
        // CTRL + SHIFT + up / down

        ages.forEach((name, age) -> System.out.println(name + " is " + age + " years olds."));
    }
}
