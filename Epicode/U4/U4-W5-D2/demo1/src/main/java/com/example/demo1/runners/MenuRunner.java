package com.example.demo1.runners;

import com.example.demo1.entities.Bevanda;
import com.example.demo1.entities.Pizza;
import com.example.demo1.entities.Topping;
import com.example.demo1.repository.BevandaRepo;
import com.example.demo1.repository.MenuRepo;
import com.example.demo1.repository.PizzaRepo;
import com.example.demo1.repository.ToppingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Order(2)
public class MenuRunner implements ApplicationRunner {

    @Autowired
    private MenuRepo menuRepo;

    @Autowired
    private PizzaRepo pizzaRepo;

    @Autowired
    private BevandaRepo bevandaRepo;

    @Autowired
    private ToppingRepo toppingRepo;


    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("MENU");
        System.out.println();
        System.out.println("PIZZE");

        List<Pizza> pizze = pizzaRepo.findAll();
        for (Pizza pizza : pizze) {
            System.out.println("Nome: " + pizza.getNome() + "\nprezzo: " + pizza.getPrezzo() + " €" + "\ncalorie: " + pizza.getCalorie() + " Kcal");
            System.out.println();
        }

        System.out.println();
        System.out.println("BEVANDE");

        List<Bevanda> bevande = bevandaRepo.findAll();
        for (Bevanda bevanda : bevande) {
            System.out.println("Nome: " + bevanda.getNome() + "\nprezzo: " + bevanda.getPrezzo() + " €" + "\ncalorie: " + bevanda.getCalorie() + " Kcal");
            System.out.println();
        }

        System.out.println();
        System.out.println("TOPPINGS");

        List<Topping> toppings = toppingRepo.findAll();
        for (Topping topping : toppings) {
            System.out.println("Nome: " + topping.getNome() + "\nprezzo: " + topping.getPrezzo() + " €" + "\ncalorie: " + topping.getCalorie() + " Kcal");
            System.out.println();

        }

    }
}
