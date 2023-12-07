package com.LuisEmmanuelCervantesRubi_EJERCICIOPRACTICO2.Emmanuel.dao;

import com.LuisEmmanuelCervantesRubi_EJERCICIOPRACTICO2.Emmanuel.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDao extends JpaRepository<Usuario, Long> {
    //ENCUENTRA POR MEDIO DEL CORREO Y DEL USUARIO
    Usuario findByCorreoAndContrasena(String correo, String contrasena);
}

