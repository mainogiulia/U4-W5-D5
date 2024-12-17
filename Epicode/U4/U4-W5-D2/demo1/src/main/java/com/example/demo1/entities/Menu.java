package com.example.demo1.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private int calorie;

    @Column(nullable = false)
    private double prezzo;

    @OneToMany(mappedBy = "menu")
    private List<Ordine> ordini = new ArrayList<>();

}