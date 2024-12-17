package com.example.demo1.repository;

import com.example.demo1.entities.Topping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToppingRepo extends JpaRepository<Topping,Long> {
}
