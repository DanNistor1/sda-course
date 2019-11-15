package com.bucur.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication mark the main class of a Spring Boot application
 * This class automatically creates the ApplicationContext from the classpath,
 * scan the configuration classes and launch the application
 * A Spring Boot application can have multiple beans implementing CommandLineRunner.
 */

@SpringBootApplication
public class BootApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class, args);
    }
}
