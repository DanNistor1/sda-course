package com.bucur.spring.core.configs.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configurare manuala
 * Spring apeleaza methoda myBean() cand este ceruta o instanta de acest tip.
 * Bean-ul rezultat va avea acelasi nume cu metoda (myBean in acest caz)
 * Daca vrem alt nume => @Bean(name="altNume") sau @Bean("altNume")
 * Toate metodele adnotate cu @Bean trebuie sa fie definite in clasa @Configuration
 */

@Configuration
public class BeanConfig {

    @Bean
    public MyBean myBean() {
        return new MyBean();
    }
}
