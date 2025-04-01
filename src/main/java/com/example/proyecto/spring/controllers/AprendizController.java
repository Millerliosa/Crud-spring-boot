package com.example.proyecto.spring.controllers;

import com.example.proyecto.spring.models.Aprendiz;
import com.example.proyecto.spring.services.AprendizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



import java.util.List;




@RestController
@RequestMapping
@CrossOrigin(origins = "http://localhost:3000")
public class AprendizController {

    @Autowired
    private AprendizService aprendizService;


    @GetMapping("/todos")
    public List<Aprendiz> getAllAprendices() {
        return aprendizService.getAllAprendices();
    }

    @GetMapping("/traer/{id}")
    public Aprendiz getAprendizById(@PathVariable Long id) {
        return aprendizService.getAprendizById(id);
    }

    @PostMapping("/crear")
    public Aprendiz createAprendiz(@RequestBody Aprendiz aprendiz) {
        return aprendizService.createAprendiz(aprendiz);
    }

    @PutMapping("/editar/{id}")
    public Aprendiz updateAprendiz(@PathVariable Long id, @RequestBody Aprendiz aprendiz) {
        return aprendizService.updateAprendiz(id, aprendiz);
    }

    @DeleteMapping("eliminar/{id}")
    public void deleteAprendiz(@PathVariable Long id) {
        aprendizService.deleteAprendiz(id);
    }
}