package com.enhancio.annotation.config;

import com.enhancio.annotation.controller.PizzaController;
import com.enhancio.annotation.service.NonVegPizza;
import com.enhancio.annotation.service.Pizza;
import com.enhancio.annotation.service.VegPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Pizza vegPizza(){
        return new VegPizza();// JAVA BASED CONFIGURATION
    }
    @Bean
    public Pizza nonVegPizza(){
        return new NonVegPizza();
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public PizzaController pizzaController(){
        return new PizzaController(nonVegPizza());
    }
}
