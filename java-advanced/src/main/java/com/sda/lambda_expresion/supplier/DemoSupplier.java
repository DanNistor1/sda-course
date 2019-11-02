package com.sda.lambda_expresion.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class DemoSupplier {

    public static void main(String[] args) {

        generateRandomNumber();

    }

    private static void generateRandomNumber(){
       Supplier<Integer> randomNumberSupplier = () -> new Random().nextInt();
       int randomNumber = randomNumberSupplier.get();
       System.out.println(randomNumber);
    }

}
