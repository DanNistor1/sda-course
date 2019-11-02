package com.sda.patherns.structural.facade.ex2.carsystem.fuel;

import java.util.logging.Logger;

public class FuelPump {

    private static final Logger logger = Logger.getLogger(FuelPump.class.getName());

    public void pump() {
        logger.info("Fuel Pump is pumping fuel..");
    }
}
