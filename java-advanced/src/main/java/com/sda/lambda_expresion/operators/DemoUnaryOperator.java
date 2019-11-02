package com.sda.lambda_expresion.operators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class DemoUnaryOperator {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 20, 30);
        UnaryOperator<Integer> unaryOperator = i -> i * i;

        useUnaryOperator(unaryOperator, list).forEach(x -> System.out.println(x));

    }

    private static List<Integer> useUnaryOperator(UnaryOperator<Integer> unaryOperator,
                                              List<Integer> list){

        List<Integer> unilist = new ArrayList<>();
        list.forEach(integer -> unilist.add(unaryOperator.apply(integer)));
        return unilist;
    }

}



