package com.example.demo1.runners;

import com.example.demo1.entities.Topping;
import com.example.demo1.repository.ToppingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Order(1)
public class ToppingRunner implements ApplicationRunner {

    @Autowired
    private ToppingRepo toppingRepository;

    @Autowired
    private Topping newToppingCheese;

    @Autowired
    private Topping newToppingHam;

    @Autowired
    private Topping newToppingOnions;

    @Autowired
    private Topping newToppingPinapple;

    @Autowired
    private Topping newToppingSalame;

    @Override
    @Transactional
    public void run(ApplicationArguments args) throws Exception {

        toppingRepository.save(newToppingCheese);
        toppingRepository.save(newToppingHam);
        toppingRepository.save(newToppingOnions);
        toppingRepository.save(newToppingPinapple);
        toppingRepository.save(newToppingSalame);

    }
}
