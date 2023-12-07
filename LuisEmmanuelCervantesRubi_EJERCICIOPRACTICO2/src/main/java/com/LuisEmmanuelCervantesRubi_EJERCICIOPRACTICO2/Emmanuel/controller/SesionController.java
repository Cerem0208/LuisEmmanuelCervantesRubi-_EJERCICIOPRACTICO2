package com.LuisEmmanuelCervantesRubi_EJERCICIOPRACTICO2.Emmanuel.controller;

import com.LuisEmmanuelCervantesRubi_EJERCICIOPRACTICO2.Emmanuel.domain.Usuario;
import com.LuisEmmanuelCervantesRubi_EJERCICIOPRACTICO2.Emmanuel.service.UsuarioService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/sesion")
public class SesionController {

    @Autowired
    private UsuarioService authService;

    @GetMapping("/InicioSesion")
    public String mostrarPaginaLogin(Model model) {
        model.addAttribute("usuarioAutenticado", false);
        return "/sesion/InicioSesion";  
    }

    @PostMapping("/login")
public String autenticar(@RequestParam String correo, @RequestParam String contrasena, HttpSession session, Model model) {
    Usuario usuarioAutenticado = authService.autenticarUsuario(correo, contrasena);

    if (usuarioAutenticado != null) {
        session.setAttribute("usuarioAutenticado", true);
        session.setAttribute("usuario", usuarioAutenticado);
        return "redirect:/usuario/UsuarioPage";
    } else {
        model.addAttribute("error", "Credenciales inválidas");
        return "/sesion/InicioSesion";
    }
}


}
