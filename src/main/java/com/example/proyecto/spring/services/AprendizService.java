package com.example.proyecto.spring.services;

import com.example.proyecto.spring.AprendizDao.AprendizDAO;
import com.example.proyecto.spring.models.Aprendiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AprendizService {

    @Autowired
    private AprendizDAO aprendizDAO;

    public List<Aprendiz> getAllAprendices() {
        return aprendizDAO.findAll();
    }

    public Aprendiz getAprendizById(Long id) {
        return aprendizDAO.findById(id).orElse(null);
    }

    public Aprendiz createAprendiz(Aprendiz aprendiz) {
        return aprendizDAO.save(aprendiz);
    }

    public Aprendiz updateAprendiz(Long id, Aprendiz aprendiz) {
        aprendiz.setId(id);
        return aprendizDAO.save(aprendiz);
    }

    public void deleteAprendiz(Long id) {
        aprendizDAO.deleteById(id);
    }
}