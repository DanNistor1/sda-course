package com.sda.generics;

import java.util.ArrayList;
import java.util.List;

public class DemoGeneric {

    public static void main(String[] args) {

        // Lista nefiind declarata generica, primeste mai multe tipuri de variabile
        // Daca o declaram generica, era fortata sa primeasca numai un anumit tip de variabila
        List names = new ArrayList();
        names.add("ana");
        names.add("alex");
        names.add(2);

        System.out.println(names);

        names.add(new Car());

        System.out.println(names);

        ToyCar toyCar = new ToyCar();
//        GenricBox<ToyCar> boxWithToyCar = new GenricBox<>(toyCar);
        GenricBox<ToyCar> boxWithToyCar1 = new GenricBox<>();
        boxWithToyCar1.add(toyCar);

        House house = new House();
//        Generic<House> generic = new Generic<>(house);
        Generic<House> generic = new Generic<>();
        generic.setElement(house);

    }
}

class Car{}

class House{}