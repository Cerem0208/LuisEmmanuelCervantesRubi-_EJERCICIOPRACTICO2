/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.LuisEmmanuelCervantesRubi_EJERCICIOPRACTICO2.Emmanuel.dao;

import com.LuisEmmanuelCervantesRubi_EJERCICIOPRACTICO2.Emmanuel.domain.Vuelos;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VueloDao extends JpaRepository<Vuelos, Long> {
    List<Vuelos> findAll();
}
