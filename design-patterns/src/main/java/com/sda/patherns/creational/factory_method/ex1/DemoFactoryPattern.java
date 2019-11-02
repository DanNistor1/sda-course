package com.sda.patherns.creational.factory_method.ex1;

import com.sda.patherns.creational.factory_method.ex1.factory.Logistics;
import com.sda.patherns.creational.factory_method.ex1.factory.RoadLogistics;
import com.sda.patherns.creational.factory_method.ex1.factory.SeaLogistics;

import java.util.Scanner;

public class DemoFactoryPattern {

    private static Logistics factory;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        if (input.equals("truck")) {
            factory = new RoadLogistics();
        } else if (input.equals("ship")) {
            factory = new SeaLogistics();
        }
        factory.planDelivery();
    }
}

