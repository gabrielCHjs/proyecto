/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tutoriaV1.proyecto.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.io.Serializable;


/**
 *
 * @author Administrador
 */
@Entity
public class persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
            private String email;
            private String nombre ;

    public persona() {
    }

    public persona ( String email, String nombre) {
       
        this.email = email;
        this.nombre = nombre;
    }

 

    public String getEmail() {
        return email;
    }

    public String getNombre() {
        return nombre;
    }

  

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
            
    
}
