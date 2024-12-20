package it.epicode.U4_W5_D5.postazione;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostazioneRepo extends JpaRepository<Postazione, Long> {
    List<Postazione> findByTipoPostazioneAndEdificioCitta(TipoPostazione tipoPostazione, String citta);

    List<Postazione> findByIsAvailableTrue();
}
