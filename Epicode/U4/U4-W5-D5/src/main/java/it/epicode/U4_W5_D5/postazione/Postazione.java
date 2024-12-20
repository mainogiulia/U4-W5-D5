package it.epicode.U4_W5_D5.postazione;

import it.epicode.U4_W5_D5.edificio.Edificio;
import it.epicode.U4_W5_D5.prenotazione.Prenotazione;
import it.epicode.U4_W5_D5.utente.Utente;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "postazioni")
public class Postazione {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    private String descrizione;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoPostazione tipoPostazione;

    @Column(name = "numero_max", nullable = false)
    private int numeroMaxOccupanti;

    @Column(nullable = false)
    private boolean isAvailable;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "edificio_id")
    private Edificio edificio;

    @ManyToMany
    private List<Utente> utenti = new ArrayList<>();

    @OneToMany(mappedBy = "postazione")
    private List<Prenotazione> prenotazioni = new ArrayList<>();
}