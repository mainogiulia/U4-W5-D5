package it.epicode.U4_W5_D5.utente;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class UtenteRunner implements ApplicationRunner {

    private final UtenteRepo utenteRepository;
    private final ObjectProvider<Utente> utenteProvider;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        for (int i = 0; i <20 ; i++) {
            Utente utente= utenteProvider.getObject();
            utenteRepository.save(utente);
        }

    }
}