/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.todocode.EjercicioVeterinaria.controller;

import com.todocode.EjercicioVeterinaria.model.Duenio;
import com.todocode.EjercicioVeterinaria.service.IServiceDuenio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DuenioController {
    
    @Autowired
    private IServiceDuenio servDue;
    
    @GetMapping("/duenio/traer")
    @ResponseBody
    public List<Duenio> getDuenio(){
        
        return servDue.getDuenio();
    }
    
    @GetMapping("/duenio/traer/{id}")
    public Duenio findDuenioID(@PathVariable Long id){

        return servDue.findDuenioID(id);
    }
    
    @PostMapping("/duenio/crear")
    public String saveDuenio(@RequestBody Duenio duenio){
        servDue.saveDuenio(duenio);
        
        return "Dueño creado correctamente"; 
    }
    
    @PutMapping("/duenio/editar")
    public String editDuenio(@RequestBody Duenio duenio){

        servDue.saveDuenio(duenio);
        
        return "Dueño editado correctamente";
    }
    
    @DeleteMapping("/duenio/eliminar/{id}")
    public String deleteDuenio(@PathVariable Long id){
        servDue.deleteDuenio(id);
        
        return "Dueño eliminado correctamente";
    }
    
    /* SECCION RESPONSE*/
    
     ResponseEntity<String> respuestaIdDuenio(){
        
        return new ResponseEntity<> ("No se encotrontó", HttpStatus.NOT_FOUND);
    }
}
