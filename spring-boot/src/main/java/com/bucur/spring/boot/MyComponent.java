package com.bucur.spring.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    private static final Logger logger = LoggerFactory.getLogger(MyComponent.class);

    public void complexOperation() {
        String greeting = "hello";
        String anotherString = "world";
        logger.debug("debug message"); // nu apare in Run tool window
        logger.trace("trace message"); // nu apare in Run tool window
        logger.info("info message {} = some text {}", greeting, anotherString);
        logger.warn("warn message");
        logger.error("error message");
    }
}
