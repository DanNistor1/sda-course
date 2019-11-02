package com.sda.patherns.structural.facade.ex2.carsystem.cooling;

import java.util.logging.Logger;

public class CoolingController {

    private static final Logger logger = Logger.getLogger(CoolingController.class.getName());
    private static final Integer DEFAULT_RADIATOR_SPEED = 10;

    private Integer temperatureUpperLimit;
    private Radiator radiator = new Radiator();
    private TemperatureSensor temperatureSensor = new TemperatureSensor();

    public void setTemperatureUpperLimit(Integer temperatureUpperLimit) {
        logger.info("Setting temperature upper limit to" + temperatureUpperLimit);
        this.temperatureUpperLimit = temperatureUpperLimit;
    }

    public void run() {
        logger.info("Cooling Controller ready!");
        radiator.setSpeed(DEFAULT_RADIATOR_SPEED);
    }

    public void cool(Integer maxAllowedTemp) {
        logger.info("Scheduled cooling with maximum allowed temperature" + maxAllowedTemp);
        temperatureSensor.getTemperature();
        radiator.on();
    }

    public void stop() {
        logger.info("Stopping Cooling Controller..");
        radiator.off();
    }
}
