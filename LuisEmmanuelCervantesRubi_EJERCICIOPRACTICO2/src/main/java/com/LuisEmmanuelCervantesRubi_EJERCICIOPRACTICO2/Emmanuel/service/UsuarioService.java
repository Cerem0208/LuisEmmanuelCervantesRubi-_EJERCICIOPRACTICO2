package com.LuisEmmanuelCervantesRubi_EJERCICIOPRACTICO2.Emmanuel.service;

import com.LuisEmmanuelCervantesRubi_EJERCICIOPRACTICO2.Emmanuel.domain.Usuario;

public interface UsuarioService {
    Usuario autenticarUsuario(String correo, String contrasena);
    Usuario save(Usuario nombre_usuario);
}
