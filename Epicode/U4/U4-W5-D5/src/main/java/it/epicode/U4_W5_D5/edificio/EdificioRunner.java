package it.epicode.U4_W5_D5.edificio;

import com.github.javafaker.Faker;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class EdificioRunner implements ApplicationRunner {
    private final EdificioService service;

    @Autowired
    private Faker faker;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Edificio edificio1 = new Edificio();
        edificio1.setNome(faker.company().name());
        edificio1.setIndirizzo(faker.address().streetAddress());
        edificio1.setCitta(faker.address().cityName());

        Edificio edificio2 = new Edificio();
        edificio2.setNome(faker.company().name());
        edificio2.setIndirizzo(faker.address().streetAddress());
        edificio2.setCitta(faker.address().cityName());

        Edificio edificio3 = new Edificio();
        edificio3.setNome(faker.company().name());
        edificio3.setIndirizzo(faker.address().streetAddress());
        edificio3.setCitta(faker.address().cityName());

        service.creaEdificioePostazioni(edificio1);
        service.creaEdificioePostazioni(edificio2);
        service.creaEdificioePostazioni(edificio3);
    }
}
