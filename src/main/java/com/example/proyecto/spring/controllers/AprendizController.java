package com.example.proyecto.spring.controllers;

import com.example.proyecto.spring.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.proyecto.spring.models.Aprendiz;


import java.util.List;

@RestController
public class AprendizController {

    @Autowired
    private Repository repo;

    @GetMapping()
    public String index(){
        return "Conectado";
    }

    @GetMapping("aprendices")
    public List<Aprendiz> getAprendices(){
        return repo.findAll();
    }


    @PostMapping("grabar")
    public String save(@RequestBody Aprendiz aprendiz){
        repo.save(aprendiz);
        return "Grabado";
    }

    @PutMapping("editar/{id}")
    public String update (@PathVariable Long id,@RequestBody Aprendiz aprendiz){
        Aprendiz updateAprendiz = repo.findById(id).get();
        updateAprendiz.setNombre(aprendiz.getNombre());
        updateAprendiz.setTelefono(aprendiz.getTelefono());
        repo.save(updateAprendiz);
        return "Aprendiz editado correctamente";
    }
    
    @DeleteMapping("eliminar/{id}")
    public String delete (@PathVariable Long id){
        Aprendiz deleteAprendiz = repo.findById(id).get();
        repo.delete(deleteAprendiz);
        return "Aprendiz eliminado correctamente";
    }



}
