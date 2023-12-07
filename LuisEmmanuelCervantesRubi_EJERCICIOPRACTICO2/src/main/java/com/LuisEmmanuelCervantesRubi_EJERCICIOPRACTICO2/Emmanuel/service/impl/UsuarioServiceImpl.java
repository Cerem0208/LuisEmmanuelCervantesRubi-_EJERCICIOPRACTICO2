package com.LuisEmmanuelCervantesRubi_EJERCICIOPRACTICO2.Emmanuel.service.impl;

import com.LuisEmmanuelCervantesRubi_EJERCICIOPRACTICO2.Emmanuel.dao.UsuarioDao;
import com.LuisEmmanuelCervantesRubi_EJERCICIOPRACTICO2.Emmanuel.domain.Usuario;
import com.LuisEmmanuelCervantesRubi_EJERCICIOPRACTICO2.Emmanuel.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    private UsuarioDao usuarioDao;  
//AUTENTICA EL USUARIO
    @Override
    public Usuario autenticarUsuario(String correo, String contrasena) {

        return usuarioDao.findByCorreoAndContrasena(correo, contrasena);
    }
    //GUARDA EL USUARIO
    @Override
    public Usuario save(Usuario nombre_usuario) {
        usuarioDao.save(nombre_usuario);
        return nombre_usuario;
    }
}