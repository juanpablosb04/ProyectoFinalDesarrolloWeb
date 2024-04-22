/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyectoFinal.servicio;


import com.proyectoFinal.dto.UsuarioRegistroDTO;
import com.proyectoFinal.modelo.Usuario;
import java.util.List;
import org.springframework.security.core.userdetails.UserDetailsService;


public interface UsuarioServicio extends UserDetailsService{

	public Usuario guardar(UsuarioRegistroDTO registroDTO);
        public List<Usuario> listarUsuarios();
}
