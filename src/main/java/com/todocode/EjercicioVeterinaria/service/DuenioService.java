/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.todocode.EjercicioVeterinaria.service;

import com.todocode.EjercicioVeterinaria.model.Duenio;
import com.todocode.EjercicioVeterinaria.repository.RepositoryDuenio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DuenioService implements IServiceDuenio{

    @Autowired
    private RepositoryDuenio repoDuenio;
    
    @Override
    public List<Duenio> getDuenio() {
        
        List<Duenio> listaDuenios = repoDuenio.findAll();
        
        return listaDuenios;
    }

    @Override
    public Duenio findDuenioID(Long id) {
        
        return repoDuenio.findById(id).orElse(null);
    }
    
    @Override
    public void saveDuenio(Duenio duenio) {
       
        repoDuenio.save(duenio);
    }

    @Override
    public void editDuenio(Duenio duenio) {
        
        this.saveDuenio(duenio);
    }

    @Override
    public void deleteDuenio(Long id) {
        
        repoDuenio.deleteById(id);
    }

    
    
}
