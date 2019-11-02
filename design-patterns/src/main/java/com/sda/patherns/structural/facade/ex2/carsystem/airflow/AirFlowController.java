package com.sda.patherns.structural.facade.ex2.carsystem.airflow;

import java.util.logging.Logger;

public class AirFlowController {

    private static final Logger logger = Logger.getLogger(AirFlowMeter.class.getName());

    private AirFlowMeter airFlowMeter = new AirFlowMeter();

    public void takeAir() {
        airFlowMeter.getMeasurements();
        logger.info("Air provided!");
    }

    public void off() {
        logger.info("Air controller switched off.");
    }
}
