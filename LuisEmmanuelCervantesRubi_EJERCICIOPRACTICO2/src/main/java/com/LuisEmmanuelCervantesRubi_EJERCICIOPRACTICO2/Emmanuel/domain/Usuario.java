/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LuisEmmanuelCervantesRubi_EJERCICIOPRACTICO2.Emmanuel.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.List;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Entity
@Data
//MAPEA LA TABLA PARA ASÍ PODER ACCEDER A LA MISMA
@Table(name="Cliente")
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;    
    @NotEmpty
    private String nombre;    
    @NotEmpty
    private String apellido;
    private String correo;
    private String telefono;
    private String nombre_usuario;
    private String contrasena;    
    private Long id_rol;
    private boolean activo;

//CREA UNA RELACIÓN ONE TO MANY CON LA TABLA roles
    @OneToMany
    @JoinColumn(name="id")
    private List<Rol> roles;
}
