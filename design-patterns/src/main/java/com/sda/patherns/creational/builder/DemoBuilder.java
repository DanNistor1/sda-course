package com.sda.patherns.creational.builder;

import com.sda.patherns.creational.builder.builders.CarBuilder;
import com.sda.patherns.creational.builder.builders.CarManualBuilder;
import com.sda.patherns.creational.builder.cars.Car;
import com.sda.patherns.creational.builder.director.Director;
import com.sda.patherns.creational.builder.manuals.Manual;

public class DemoBuilder {

    public static void main(String[] args) {

        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);
        Car sportCar = carBuilder.getResult();
        System.out.println("Car type: " + sportCar.getType() + "\n");

        CarManualBuilder carManualBuilder = new CarManualBuilder();
        director.constructSportsCar(carManualBuilder);
        Manual sportCarManual = carManualBuilder.getResult();
        System.out.println(sportCarManual.print());
    }
}
