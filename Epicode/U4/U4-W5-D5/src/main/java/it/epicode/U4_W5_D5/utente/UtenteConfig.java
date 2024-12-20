package it.epicode.U4_W5_D5.utente;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;

@Configuration
@Order(1)
public class UtenteConfig {

    @Autowired
    private Faker faker;

    @Bean
    @Scope("prototype")
    public Utente newUtente(){
        Utente utente = new Utente();
        utente.setNome(faker.name().firstName());
        utente.setCognome(faker.name().lastName());
        utente.setEmail(faker.internet().emailAddress());
        utente.setUsername(faker.name().username());
        return utente;
    }

}