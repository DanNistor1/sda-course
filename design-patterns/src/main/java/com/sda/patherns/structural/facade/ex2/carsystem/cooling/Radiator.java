package com.sda.patherns.structural.facade.ex2.carsystem.cooling;

import java.util.logging.Logger;

public class Radiator {

    private static final Logger logger = Logger.getLogger(CoolingController.class.getName());

    public void on() {
        logger.info("Radiator switched on!");
    }

    public void off() {
        logger.info("Radiator switched off!");
    }

    public void setSpeed(Integer speed) {
        logger.info("Setting radiator speed to " + speed);
    }
}
