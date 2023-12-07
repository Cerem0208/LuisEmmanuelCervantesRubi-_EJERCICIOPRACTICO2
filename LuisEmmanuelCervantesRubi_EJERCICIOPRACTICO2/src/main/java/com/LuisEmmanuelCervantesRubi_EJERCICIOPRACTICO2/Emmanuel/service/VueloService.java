/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.LuisEmmanuelCervantesRubi_EJERCICIOPRACTICO2.Emmanuel.service;

import com.LuisEmmanuelCervantesRubi_EJERCICIOPRACTICO2.Emmanuel.dao.VueloDao;
import com.LuisEmmanuelCervantesRubi_EJERCICIOPRACTICO2.Emmanuel.domain.Vuelos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VueloService {

    private final VueloDao vuelosDao;

    @Autowired
    public VueloService(VueloDao vuelosDao) {
        this.vuelosDao = vuelosDao;
    }

    public List<Vuelos> getVuelosDisponibles() {
        return vuelosDao.findAll();
    }


}