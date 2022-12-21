/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ceep.academia.data;

import com.ceep.academia.domain.Persona;
import java.util.List;

/**
 *
 * @author loren
 */
public interface iPersonaDao {
    public List<Persona> findAllPersona();
    public Persona findPersonaById(Persona persona);
    public Persona findPersonaByEmail(Persona persona);
    public void insertarPersona(Persona persona);
    public void updatePersona (Persona persona);
    public void deletePersona(Persona persona);
    
}
