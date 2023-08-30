package com.lorenzo.terroristas.controllers;

import com.lorenzo.terroristas.models.Terroristas;
import com.lorenzo.terroristas.services.ITerroristasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/terrorismo")
public class TerroristasController {
    @Autowired
    private ITerroristasService terroristaService;

    @GetMapping("/api")
    public String saludo() {
        return "Hola gaston";
    }

    @GetMapping("/lista")
    public List<Terroristas> findAll(){
        return terroristaService.findAll();
    }

    @GetMapping("/lista/{id}")
    public Terroristas verTerrorista(@PathVariable Long id){
        return terroristaService.findById(id);
    }

    @PostMapping("/crear")
    public List<Terroristas> crearTerrorista(@RequestBody Terroristas terrorista){
        terroristaService.save(terrorista);
        return terroristaService.findAll();
    }

    @DeleteMapping("/borrar/{id}")
    public void borrarTerrorista(@PathVariable Long id){
        terroristaService.delete(id);
    }

    @PutMapping("/actualizar/{id}")
    public Terroristas update (@PathVariable Long id, @RequestBody Terroristas terrorista){
        Terroristas terroristaActual = terroristaService.findById(id);
        if (terroristaActual != null){
            terroristaActual.setNombre(terrorista.getNombre());
            terroristaActual.setAlias(terrorista.getAlias());
            terroristaActual.setNacionalidad(terrorista.getNacionalidad());
            terroristaActual.setPosicionMasBuscados(terrorista.getPosicionMasBuscados());
        }

        return terroristaService.save(terroristaActual);
    }


}
