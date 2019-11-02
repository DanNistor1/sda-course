package com.sda.lambda_expresion.fuction;

import java.util.HashMap;
import java.util.Map;

public class DemoFunctions {

    public static void main(String[] args) {
        Map<String, Integer> nameMap = new HashMap<>();
        Integer value = nameMap.computeIfAbsent("John", s -> s.length());

    }
}
