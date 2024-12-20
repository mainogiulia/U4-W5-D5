package it.epicode.U4_W5_D5.prenotazione;

import it.epicode.U4_W5_D5.postazione.Postazione;
import it.epicode.U4_W5_D5.postazione.PostazioneRepo;
import it.epicode.U4_W5_D5.utente.Utente;
import it.epicode.U4_W5_D5.utente.UtenteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
public class PrenotazioneService {

    @Autowired
    private PostazioneRepo postazioneRepo;

    @Autowired
    private UtenteRepo utenteRepo;

    @Autowired
    private PrenotazioneConfig prenotazioneConfig;

    @Autowired
    private PrenotazioneRepo prenotazioneRepo;

    @Transactional
    public Prenotazione prenotaPostazione(Long postazioneId, Long utenteId, LocalDate dataInizioPrenotazione) {

        Utente utente = utenteRepo.findById(utenteId)
                .orElseThrow(() -> new RuntimeException("Utente non trovato"));

        Postazione postazione = postazioneRepo.findById(postazioneId)
                .orElseThrow(() -> new RuntimeException("Postazione non trovata"));

        List<Prenotazione> prenotazioniUtente = prenotazioneRepo.findPrenotazioniByUtenteAndData(utenteId, dataInizioPrenotazione);

        if (!postazione.isAvailable()) {
            throw new RuntimeException("La postazione non è disponibile");
        } else if (!prenotazioniUtente.isEmpty()) {
            System.out.println("Hai già una prenotazione per questa data, per favore seleziona un'altra data");
        }

        Prenotazione prenotazione = prenotazioneConfig.newPrenotazione(dataInizioPrenotazione);
        prenotazione.setUtente(utente);
        prenotazione.setPostazione(postazione);
        prenotazione.setDataInizioPrenotazione(dataInizioPrenotazione);

        prenotazioneRepo.save(prenotazione);

        postazione.setAvailable(false);
        postazioneRepo.save(postazione);

        return prenotazione;
    }
}