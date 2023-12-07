package com.LuisEmmanuelCervantesRubi_EJERCICIOPRACTICO2.Emmanuel.dao;

import com.LuisEmmanuelCervantesRubi_EJERCICIOPRACTICO2.Emmanuel.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDao extends JpaRepository<Usuario, Long> {
 /*
//HACE LAS BUSQUEDAS EN BASE A LOS VALORES, POR USUARIO
    Usuario findBynombre_usuario(String nombre_usuario);
//HACE LAS BUSQUEDAS EN BASE A LOS VALORES, POR USUARIO Y CONTRASEÑA    
    Usuario findBynombre_usuarioAndcontrasena(String nombre_usuario, String contrasena);
//HACE LAS BUSQUEDAS EN BASE A LOS VALORES, POR USUARIO O CORREO
    Usuario findBynombre_usuarioOrcorreo(String nombre_usuario, String correo);
//HACE LA VERIFICACIÓN DE EXISTENCIA EN BASE A LOS VALORES, POR USUARIO O CORREO
    boolean existsBynombre_usuarioOrcorreo(String nombre_usuario, String correo);
*/
}
