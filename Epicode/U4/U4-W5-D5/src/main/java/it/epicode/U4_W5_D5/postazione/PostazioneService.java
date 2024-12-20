package it.epicode.U4_W5_D5.postazione;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostazioneService {

    @Autowired
    private PostazioneRepo postazioneRepo;

    public List<Postazione> cercaPostazioni(TipoPostazione tipoPostazione, String citta) {
        return postazioneRepo.findByTipoPostazioneAndEdificioCitta(tipoPostazione, citta);
    }

    @Transactional
    public List<Postazione> cercaPostazioniDisponibili() {
        return postazioneRepo.findByIsAvailableTrue();
    }
}