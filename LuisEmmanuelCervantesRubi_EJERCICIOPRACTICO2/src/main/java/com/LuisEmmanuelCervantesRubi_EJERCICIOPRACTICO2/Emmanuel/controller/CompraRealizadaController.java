/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LuisEmmanuelCervantesRubi_EJERCICIOPRACTICO2.Emmanuel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/compra") //PIDE EL MAPEO DE LA TARJETA
public class CompraRealizadaController {
    @GetMapping("/CompraRealizada") //MAPEA EL HTML
    public String acercade() {

        return "/compra/CompraRealizada"; //MUESTRA LA RUTA COMPLETA
    }
}

