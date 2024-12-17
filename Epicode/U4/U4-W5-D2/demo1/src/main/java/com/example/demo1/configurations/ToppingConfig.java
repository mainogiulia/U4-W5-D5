package com.example.demo1.configurations;

import com.example.demo1.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ToppingConfig {

    @Bean
    Topping newToppingCheese() {
        Topping topping= new Topping();
        topping.setNome("Cheese");
        topping.setCalorie(92);
        topping.setPrezzo(0.70);
        return topping;
    }

    @Bean
    Topping newToppingHam() {
        Topping topping= new Topping();
        topping.setNome("Ham");
        topping.setCalorie(35);
        topping.setPrezzo(1.0);
        return topping;
    }

    @Bean
    Topping newToppingOnions() {
        Topping topping= new Topping();
        topping.setNome("Onions");
        topping.setCalorie(22);
        topping.setPrezzo(0.70);
        return topping;
    }

    @Bean
    Topping newToppingPinapple() {
        Topping topping= new Topping();
        topping.setNome("Pineapple");
        topping.setCalorie(24);
        topping.setPrezzo(0.80);
        return topping;
    }

    @Bean
    Topping newToppingSalame() {
        Topping topping= new Topping();
        topping.setNome("Salame");
        topping.setCalorie(86);
        topping.setPrezzo(1.0);
        return topping;
    }
}
