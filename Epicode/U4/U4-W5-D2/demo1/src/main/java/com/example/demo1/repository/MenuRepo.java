package com.example.demo1.repository;

import com.example.demo1.entities.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepo extends JpaRepository<Menu,Long> {

}
