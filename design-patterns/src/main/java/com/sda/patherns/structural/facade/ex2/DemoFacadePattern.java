package com.sda.patherns.structural.facade.ex2;

public class DemoFacadePattern {

    public static void main(String[] args) {

        CarEngineFacade carEngineFacade = new CarEngineFacade();
        carEngineFacade.startEngine();
        System.out.println();
        carEngineFacade.stopEngine();

    }
}
