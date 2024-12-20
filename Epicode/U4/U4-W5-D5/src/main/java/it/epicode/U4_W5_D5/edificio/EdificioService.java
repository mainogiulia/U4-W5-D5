package it.epicode.U4_W5_D5.edificio;

import it.epicode.U4_W5_D5.postazione.Postazione;
import it.epicode.U4_W5_D5.postazione.PostazioneRepo;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EdificioService {

    private final EdificioRepo edificioRepo;
    private final PostazioneRepo postazioneRepo;
    private final ApplicationContext context;

    @Transactional
    public Edificio creaEdificioePostazioni(Edificio edificio) {
        edificioRepo.save(edificio);

        Postazione privato = context.getBean("newPostazionePrivato", Postazione.class);
        Postazione openspace = context.getBean("newPostazioneOpenSpace", Postazione.class);
        Postazione salaRiunioni = context.getBean("newPostazioneSalaRiunioni", Postazione.class);

        privato.setEdificio(edificio);
        openspace.setEdificio(edificio);
        salaRiunioni.setEdificio(edificio);

        postazioneRepo.save(privato);
        postazioneRepo.save(openspace);
        postazioneRepo.save(salaRiunioni);

        edificio.getPostazioni().add(privato);
        edificio.getPostazioni().add(openspace);
        edificio.getPostazioni().add(salaRiunioni);

        return edificio;
    }
}
