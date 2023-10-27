package com.enhancio.annotation.controller;

import com.enhancio.annotation.service.Pizza;
import com.enhancio.annotation.service.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("pizza")// bean name
public class PizzaController {

    private Pizza pizza;
    //@Autowired

    public PizzaController(@Qualifier("nonVegPizza") Pizza pizza){
        this.pizza = pizza;
    }
   /* @Autowired
    public void setVegPizza(VegPizza vegPizza){
        this.vegPizza= vegPizza;
    }*/

    public String getPizza(){
        return pizza.getPizza();
    }
    public void init(){
        System.out.println("Initialization");
    }
    public void destroy(){
        System.out.println("Destruction");
    }
}
