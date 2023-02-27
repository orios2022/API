/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.todocode.EjercicioVeterinaria.service;

import com.todocode.EjercicioVeterinaria.model.Duenio;
import java.util.List;


public interface IServiceDuenio {
    
    public List<Duenio> getDuenio();
    public Duenio findDuenioID(Long id);
    public void saveDuenio(Duenio duenio);
    public void editDuenio(Duenio duenio);
    public void deleteDuenio(Long id);
}
