package com.sda.patherns.structural.facade.ex2.carsystem.fuel;

import java.util.logging.Logger;

public class FuelInjector {

    private static final Logger logger = Logger.getLogger(FuelInjector.class.getName());

    private FuelPump fuelPump = new FuelPump();

    public void on() {
        logger.info("Fuel injector ready to inject fuel.");
    }

    public void inject() {
        fuelPump.pump();
        logger.info("Fuel injected.");
    }

    public void off() {
        logger.info("Stopping Fuel injector..");
    }
}
