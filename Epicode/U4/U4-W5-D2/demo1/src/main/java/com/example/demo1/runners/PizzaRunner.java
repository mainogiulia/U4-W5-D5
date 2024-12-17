package com.example.demo1.runners;

import com.example.demo1.entities.Pizza;
import com.example.demo1.repository.PizzaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Order(1)
public class PizzaRunner implements ApplicationRunner {

    @Autowired
    private PizzaRepo pizzaRepository;

    @Autowired
    private Pizza newPizzaMargherita;

    @Autowired
    private Pizza newPizzaHawaaiiana;

    @Autowired
    private Pizza newPizzaSalame;

    @Override
    @Transactional
    public void run(ApplicationArguments args) throws Exception {

        pizzaRepository.save(newPizzaMargherita);
        pizzaRepository.save(newPizzaHawaaiiana);
        pizzaRepository.save(newPizzaSalame);

    }
}
