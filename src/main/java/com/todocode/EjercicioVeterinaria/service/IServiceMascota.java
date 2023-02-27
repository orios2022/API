/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.todocode.EjercicioVeterinaria.service;

import com.todocode.EjercicioVeterinaria.DTO.MascotaDuenioDTO;
import com.todocode.EjercicioVeterinaria.model.Mascota;
import java.util.List;


public interface IServiceMascota {
    
    public List<Mascota> getMascota();
    public Mascota findMascota(Long id);
    public void saveMascota(Mascota mascota);
    public void editMascota(Mascota mascota);
    public void deleteMascota(Long id);
    public MascotaDuenioDTO getDTO(Long id);
    public List<Mascota> getListPerroCaniche();
}
