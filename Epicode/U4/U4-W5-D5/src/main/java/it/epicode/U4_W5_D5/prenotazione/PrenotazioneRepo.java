package it.epicode.U4_W5_D5.prenotazione;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface PrenotazioneRepo extends JpaRepository<Prenotazione, Long> {

    @Query("SELECT p FROM Prenotazione p WHERE p.utente.id = :utenteId AND :dataInizioPrenotazione BETWEEN p.dataInizioPrenotazione AND p.dataFinePrenotazione")
    List<Prenotazione> findPrenotazioniByUtenteAndData(@Param("utenteId") Long utenteId, @Param("dataInizioPrenotazione") LocalDate dataPrenotazione);
}
