package com.example.proyecto.spring.AprendizDao;

import com.example.proyecto.spring.models.Aprendiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AprendizDAO extends JpaRepository<Aprendiz, Long> {
}
