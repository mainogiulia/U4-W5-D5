package com.example.demo1.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="pizze")
public class Pizza extends Menu {
}
