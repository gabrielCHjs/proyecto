/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tutoriaV1.proyecto.controladores;


import com.tutoriaV1.proyecto.servicios.PersonaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @Controller indicamos que esun controlador
   @RequestMapping   indicamos como vamos a conectarnos entre HTML y los controladores
 * @author Administrador
 */
@Controller
@RequestMapping("/persona")/** aqui indicamos la ruta a de donde va a tomar el fdato para guardar*/
public class PersonaController {
    @Autowired
    private PersonaServicio PersonaServicio;
    
    
    @GetMapping("/persona")
    public String guardarPersona(){
    return "form_persona.html";
}
    @PostMapping("/registrar")
    public String guardarPersona(@RequestParam String nombre,@RequestParam String email){
        
        PersonaServicio.savePersona(nombre, email);
    return "form_persona.html";
}
}
 