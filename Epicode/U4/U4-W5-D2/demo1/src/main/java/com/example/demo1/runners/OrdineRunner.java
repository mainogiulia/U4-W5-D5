package com.example.demo1.runners;

import com.example.demo1.entities.Ordine;
import com.example.demo1.entities.enums.StatoOrdine;
import com.example.demo1.repository.MenuRepo;
import com.example.demo1.repository.OrdineRepo;
import com.example.demo1.repository.TavoloRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OrdineRunner implements ApplicationRunner {

    private final OrdineRepo ordineRepo;
    private final TavoloRepo tavoloRepo;
    private final MenuRepo menuRepo;

    @Override
    public void run(ApplicationArguments args)throws Exception{
        Ordine ordine = new Ordine();
        ordine.setStatoOrdine(StatoOrdine.IN_CORSO);
        ordineRepo.save(ordine);
    }
}
