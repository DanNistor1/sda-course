package com.sda.patherns.creational.factory_method.ex1.transports;

public class Truck implements Transport {

    @Override
    public void deliver() {
        System.out.println("truck delivering");
    }
}
