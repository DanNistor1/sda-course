package com.sda.lambda_expresion.consumer;

import java.util.Arrays;
import java.util.List;

public class DemoConsumer {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("John", "Freddy", "Samuel");

// exemplu de folosire a unui bloc de comenzi

        names.forEach(name -> {
            System.out.println(name);
            System.out.println(name);
            System.out.println(name);
            System.out.println(name);
        });
    }
}
