package com.example.proyecto.spring.repository;

import com.example.proyecto.spring.models.Aprendiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Aprendiz, Long> {
}
