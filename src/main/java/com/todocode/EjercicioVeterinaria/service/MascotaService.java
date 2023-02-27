/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.todocode.EjercicioVeterinaria.service;

import com.todocode.EjercicioVeterinaria.DTO.MascotaDuenioDTO;
import com.todocode.EjercicioVeterinaria.model.Mascota;
import com.todocode.EjercicioVeterinaria.repository.RepositoryMascota;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotaService implements IServiceMascota{

    @Autowired
    private RepositoryMascota repoMasco;
    
    @Override
    public List<Mascota> getMascota() {
        
        List<Mascota> listaMascota = repoMasco.findAll();
        
        return listaMascota;
    }

    @Override
    public Mascota findMascota(Long id) {
        
        return repoMasco.findById(id).orElse(null);

    }

    @Override
    public void saveMascota(Mascota m) {
        
        repoMasco.save(m);
    }
    
     @Override
    public void editMascota(Mascota masco){
            
            this.saveMascota(masco);
    }

    @Override
    public void deleteMascota(Long id) {
       
        repoMasco.deleteById(id);
    }

    @Override
    public MascotaDuenioDTO getDTO(Long id) {
    
        MascotaDuenioDTO mascDueDTO = new MascotaDuenioDTO ();
        Mascota masco = this.findMascota(id);
        mascDueDTO.setNombre_mascota(masco.getNombre());
        mascDueDTO.setEspecie(masco.getEspecie());
        mascDueDTO.setRaza(masco.getRaza());
        mascDueDTO.setNombre_duenio(masco.getDuenio().getNombre());
        mascDueDTO.setApellido_duenio(masco.getDuenio().getApellido());
        
        return mascDueDTO;
        
    }

    @Override
    public List<Mascota> getListPerroCaniche() {
        
        List<Mascota> listaMascota = repoMasco.findAll();
        List<Mascota> listaBuscada = new ArrayList<>();
        
        for(Mascota lm: listaMascota){
            if(lm.getEspecie().equalsIgnoreCase("perro") && lm.getRaza().equalsIgnoreCase("caniche")){
                listaBuscada.add(lm);
            }
        }
        return listaBuscada;
    }

   
    
}
