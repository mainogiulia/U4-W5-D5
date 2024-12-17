package com.example.demo1.repository;

import com.example.demo1.entities.Bevanda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BevandaRepo extends JpaRepository<Bevanda,Long> {
}
