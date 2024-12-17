package com.example.demo1.repository;

import com.example.demo1.entities.Tavolo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TavoloRepo extends JpaRepository<Tavolo,Long> {
}
