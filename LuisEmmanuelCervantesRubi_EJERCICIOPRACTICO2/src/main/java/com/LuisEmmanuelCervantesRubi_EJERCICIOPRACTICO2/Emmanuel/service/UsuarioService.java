package com.LuisEmmanuelCervantesRubi_EJERCICIOPRACTICO2.Emmanuel.service;

import com.LuisEmmanuelCervantesRubi_EJERCICIOPRACTICO2.Emmanuel.domain.Usuario;

public interface UsuarioService {
    //CODIGO QUE AUTENTICA EL USUARIO Y LO GUARDA
    Usuario autenticarUsuario(String correo, String contrasena);
    Usuario save(Usuario nombre_usuario);
}
