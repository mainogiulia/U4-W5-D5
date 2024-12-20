package it.epicode.U4_W5_D5.postazione;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;

@Configuration
@Order(3)
public class PostazioneConfig {
    @Autowired
    private Faker faker;

    @Bean(name = "newPostazionePrivato")
    @Scope("prototype")
    public Postazione newPrivato(){
        Postazione postazione = new Postazione();
        postazione.setDescrizione(faker.lorem().sentence());
        postazione.setTipoPostazione(TipoPostazione.PRIVATO);
        postazione.setNumeroMaxOccupanti(faker.number().numberBetween(5,30));
        postazione.setAvailable(true);
        return postazione;
    }

    @Bean(name = "newPostazioneOpenSpace")
    @Scope("prototype")
    public Postazione newOpenSpace(){
        Postazione postazione = new Postazione();
        postazione.setDescrizione(faker.lorem().sentence());
        postazione.setTipoPostazione(TipoPostazione.OPENSPACE);
        postazione.setNumeroMaxOccupanti(faker.number().numberBetween(10,80));
        postazione.setAvailable(true);
        return postazione;
    }

    @Bean(name = "newPostazioneSalaRiunioni")
    @Scope("prototype")
    public Postazione newSalaRiunioni(){
        Postazione postazione = new Postazione();
        postazione.setDescrizione(faker.lorem().sentence());
        postazione.setTipoPostazione(TipoPostazione.SALA_RIUNIONI);
        postazione.setNumeroMaxOccupanti(faker.number().numberBetween(15,120));
        postazione.setAvailable(true);
        return postazione;
    }
}
