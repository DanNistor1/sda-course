package com.sda.patherns.creational.factory_method.ex1.transports;

public class Ship implements Transport {

    @Override
    public void deliver() {
        System.out.println("ship delivering");
    }
}
