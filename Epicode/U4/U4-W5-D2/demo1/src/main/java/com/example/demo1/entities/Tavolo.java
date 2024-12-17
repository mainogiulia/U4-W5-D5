package com.example.demo1.entities;

import com.example.demo1.entities.enums.StatoTavolo;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@NamedQuery(name = "Trova_tutto_tavolo", query = "SELECT a FROM Tavolo a")
public class Tavolo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "numero_max_coperti", nullable = false)
    private int numeroMaxCoperti;

    @Column(name = "stato_tavolo", nullable = false)
    private StatoTavolo statoTavolo;

    @OneToOne
    private Ordine ordine;
}
