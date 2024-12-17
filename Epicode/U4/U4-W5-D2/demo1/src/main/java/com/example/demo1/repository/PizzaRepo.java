package com.example.demo1.repository;

import com.example.demo1.entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepo extends JpaRepository<Pizza,Long> {
}
