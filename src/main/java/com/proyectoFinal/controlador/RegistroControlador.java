/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoFinal.controlador;

import com.proyectoFinal.modelo.Usuario;
import com.proyectoFinal.repositorio.UsuarioRepositorio;
import com.proyectoFinal.servicio.UsuarioServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistroControlador {

    @Autowired
    private UsuarioServicio servicio;
    
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @GetMapping("/login")
    public String iniciarSesion() {
        return "login";
    }

    @PostMapping("/login")
    public String procesarInicioSesion(@RequestParam("email") String email, @RequestParam("password") String password, Model modelo) {
        // Buscar el usuario en la base de datos por correo electrónico
        Usuario usuario = usuarioRepositorio.findByEmail(email);

        if (usuario != null && usuario.getPassword().equals(password)) {
            // Si el usuario existe y la contraseña es válida, redirigir al usuario a la página de prueba
            return "redirect:/index";
        } else {
            // Si el usuario no existe o la contraseña no es válida, mostrar un mensaje de error
            modelo.addAttribute("error", true);
            return "login";
        }
    }
    
    @GetMapping("/index")
    public String mostrarInicio() {
        return "index"; // Redirigir al usuario a la página de prueba
    }

}
