package it.epicode.U4_W5_D5.edificio;

import com.github.javafaker.Faker;
import it.epicode.U4_W5_D5.postazione.PostazioneRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;

@Configuration
@Order(2)
public class EdificioConfig {
    @Autowired
    private Faker faker;

    @Autowired
    private PostazioneRepo postazioneRepo;

    @Bean(name = "newEdificio")
    @Scope("prototype")
    public Edificio newEdificio() {
        Edificio edificio = new Edificio();
        edificio.setNome(faker.company().name());
        edificio.setIndirizzo(faker.address().streetAddress());
        edificio.setCitta(faker.address().cityName());
        edificio.setPostazioni(postazioneRepo.findAll());
        return edificio;
    }
}
