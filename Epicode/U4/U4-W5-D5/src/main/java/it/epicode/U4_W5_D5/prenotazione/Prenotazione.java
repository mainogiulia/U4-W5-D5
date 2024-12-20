package it.epicode.U4_W5_D5.prenotazione;

import it.epicode.U4_W5_D5.postazione.Postazione;
import it.epicode.U4_W5_D5.utente.Utente;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "prenotazioni")
public class Prenotazione {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "data_inizio", nullable = false)
    private LocalDate dataInizioPrenotazione;

    @Column(name = "data_fine", nullable = false)
    private LocalDate dataFinePrenotazione;

    @ManyToOne
    @JoinColumn(name = "utente_id")
    private Utente utente;

    @ManyToOne
    @JoinColumn(name = "postazione_id")
    private Postazione postazione;
}