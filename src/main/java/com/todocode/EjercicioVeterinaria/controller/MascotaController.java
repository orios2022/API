/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.todocode.EjercicioVeterinaria.controller;

import com.todocode.EjercicioVeterinaria.DTO.MascotaDuenioDTO;
import com.todocode.EjercicioVeterinaria.model.Mascota;
import com.todocode.EjercicioVeterinaria.service.IServiceMascota;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MascotaController {
    
   @Autowired
    private IServiceMascota servMasco;
   
   @GetMapping("/mascota/traer")
    public List<Mascota> getMascota(){
    
    return servMasco.getMascota();
}
    @GetMapping("/mascota/traer/{id}")
    public Mascota findMascota(@PathVariable Long id){
        
        return servMasco.findMascota(id);
    } 
    
    @PostMapping("/mascota/crear")
    public String  saveMascota(@RequestBody Mascota mascota){
        servMasco.saveMascota(mascota);
        
        return "Mascota creada correctamente";  
    }
    
    @PutMapping("/mascota/editar")
    public String editMascota(@RequestBody Mascota masco) {
        servMasco.editMascota(masco);
        return "Mascota editada correctamente";
    }
    
    @DeleteMapping("/mascota/eliminar/{id}")
    public String deleteMascota(@PathVariable Long id){
        servMasco.deleteMascota(id);
        
        return "Mascota eliminada correctamente";  
    }
    
    @GetMapping("/mascota/traerDTO/{id}")
    public MascotaDuenioDTO getDTO(@PathVariable Long id){
        
        return servMasco.getDTO(id);
    }
    
    @GetMapping("/mascota/traer/caniche")
    public List<Mascota> getListPerroCaniche(){
        
        return servMasco.getListPerroCaniche();
    }
}
