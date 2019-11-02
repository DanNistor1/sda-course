package com.sda.streams.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Ex1 {
    public static void main(String[] args) {
        List<String> versions = new ArrayList<>();
        versions.add("KitKat");
        versions.add("Ice Cream Sandwidth ");
        versions.add("Honeycomb");
        versions.add("Gingerbread");

        Predicate<String> p = s -> s.length() > 10;

        List<String> list = versions.stream()
                .filter(p)
                .collect(Collectors.toList());

        list.forEach(System.out::println);
        System.out.println();
        filterList(versions).forEach(System.out::println);
    }

    private static List<String> filterList(List<String> oldList) {
        List<String> newList = new ArrayList<>();
        newList = oldList.stream()
                .filter(s -> s.length() > 10)
                .collect(Collectors.toList());

        return newList;
    }
}
