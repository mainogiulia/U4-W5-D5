package it.epicode.U4_W5_D5.utente;

import it.epicode.U4_W5_D5.edificio.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtenteRepo extends JpaRepository<Utente, Long> {
}
