/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tutoriaV1.proyecto.servicios;


import com.tutoriaV1.proyecto.entidades.persona;
import com.tutoriaV1.proyecto.repositorio.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *@Service
 *@Autowired simplifica/// evitamos que  tengamos que hacer el NEW ;spring se encarga de inicializar por nosotros
 * @author Administrador
 */
@Service
public class PersonaServicio {
    @Autowired
    private PersonaRepository PersonaRepository;
    
  
    public persona savePersona (String nombre, String email){
    persona p = new persona();
    
    p.setNombre(nombre);
    p.setEmail(email);
    return PersonaRepository.save(p);
}

   public List<persona> getAllpersona ( ){
    
    return PersonaRepository.findAll();
}
}