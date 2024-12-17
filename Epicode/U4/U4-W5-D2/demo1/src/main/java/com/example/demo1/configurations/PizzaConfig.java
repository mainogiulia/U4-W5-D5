package com.example.demo1.configurations;

import com.example.demo1.entities.Pizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PizzaConfig {

    @Bean
    Pizza newPizzaMargherita() {
        Pizza pizza = new Pizza();
        pizza.setNome("Margherita");
        pizza.setCalorie(1104);
        pizza.setPrezzo(5.0);
        return pizza;
    }

    @Bean
    Pizza newPizzaHawaaiiana() {
        Pizza pizza = new Pizza();
        pizza.setNome("Hawaaiiana");
        pizza.setCalorie(1024);
        pizza.setPrezzo(6.50);
        return pizza;
    }

    @Bean
    Pizza newPizzaSalame() {
        Pizza pizza = new Pizza();
        pizza.setNome("Salame");
        pizza.setCalorie(1160);
        pizza.setPrezzo(6.0);
        return pizza;
    }


}
