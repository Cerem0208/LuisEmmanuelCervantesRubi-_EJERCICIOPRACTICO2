package com.LuisEmmanuelCervantesRubi_EJERCICIOPRACTICO2.Emmanuel.controller;
import com.LuisEmmanuelCervantesRubi_EJERCICIOPRACTICO2.Emmanuel.domain.Usuario;
import com.LuisEmmanuelCervantesRubi_EJERCICIOPRACTICO2.Emmanuel.domain.Vuelos;
import com.LuisEmmanuelCervantesRubi_EJERCICIOPRACTICO2.Emmanuel.service.VueloService;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

//ESTE CÓDIGO SE ENCARGA DE PERMITIR EL DISPLAY TANTO DE LOS DATOS DE USUARIO COMO LOS DATOS DE LOS VUELOS

@Controller
@Slf4j
@RequestMapping("/usuario")
public class UsuarioPageController {

    @Autowired
     private VueloService vuelosService;
    

    @GetMapping("/UsuarioPage")
    public String inicio(Model model, HttpSession session) {
        if (session.getAttribute("usuarioAutenticado") != null) {

            Object usuarioAtributo = session.getAttribute("usuario");
            if (usuarioAtributo instanceof Usuario) {
                Usuario usuario = (Usuario) usuarioAtributo;
                model.addAttribute("usuario", usuario);

                List<Vuelos> vuelosDisponibles = vuelosService.getVuelosDisponibles();
                model.addAttribute("vuelos", vuelosDisponibles);
                model.addAttribute("totalVuelos", vuelosDisponibles.size());

                return "/usuario/UsuarioPage";
            } else {

                return "redirect:/login"; 
            }
        } else {

            return "redirect:/login"; 
        }
    }
    
}