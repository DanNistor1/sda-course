package com.sda.patherns.structural.facade.ex2.carsystem;

import java.util.logging.Logger;

public class CatalyticConverter {

    private static final Logger logger = Logger.getLogger(CatalyticConverter.class.getName());

    public void on() {
        logger.info("Catalytic Converter switched on!");
    }

    public void off() {
        logger.info("Catalytic Converter switched off!");
    }
}
