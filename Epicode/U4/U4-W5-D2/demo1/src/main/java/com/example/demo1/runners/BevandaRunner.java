package com.example.demo1.runners;

import com.example.demo1.entities.Bevanda;
import com.example.demo1.repository.BevandaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class BevandaRunner implements ApplicationRunner {
    @Autowired
    private BevandaRepo bevandaRepository;

    @Autowired
    private Bevanda newBevandaLemonade;

    @Autowired
    private Bevanda newBevandaWater;

    @Autowired
    private Bevanda newBevandaWine;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        bevandaRepository.save(newBevandaLemonade);
        bevandaRepository.save(newBevandaWater);
        bevandaRepository.save(newBevandaWine);

    }
}
