/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoFinal.controlador;

import ch.qos.logback.core.model.Model;
import com.proyectoFinal.modelo.Usuario;
import com.proyectoFinal.repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistroController {

    @Autowired
    private UsuarioRepositorio usuarioRepository; // Debes crear esta interfaz

    @PostMapping("/registro")
    public String registrarUsuario(@ModelAttribute Usuario usuario, Model model) {

        usuarioRepository.save(usuario);
        
        // Redirigir a la página de inicio de sesión con un parámetro de éxito
        return "redirect:/login?exito";
    }
}