package it.epicode.U4_W5_D5.prenotazione;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;

import java.time.LocalDate;

@Configuration
@Order(4)
public class PrenotazioneConfig {
    @Autowired
    private Faker faker;

    @Bean(name = "newPrenotazione")
    @Scope("prototype")
    public Prenotazione newPrenotazione(LocalDate dataInizio) {
        Prenotazione prenotazione = new Prenotazione();
        prenotazione.setDataInizioPrenotazione(dataInizio);
        prenotazione.setDataFinePrenotazione(dataInizio.plusDays(1));
        return prenotazione;
    }
}
