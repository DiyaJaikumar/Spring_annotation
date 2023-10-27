package com.enhancio.annotation;

import com.enhancio.annotation.controller.PizzaController;
import com.enhancio.annotation.service.NonVegPizza;
import com.enhancio.annotation.service.Pizza;
import com.enhancio.annotation.service.VegPizza;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnnotationApplication {

	public static void main(String[] args) {

		var context = SpringApplication.run(AnnotationApplication.class, args);
		PizzaController pizcon = (PizzaController) context.getBean("pizzaController");
		System.out.println(pizcon.getPizza());

		//VegPizza vegPizza= context.getBean(VegPizza.class);
		//System.out.println(vegPizza.getPizza());
	}


}
