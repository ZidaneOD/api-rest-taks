package com.project.apiresttaks.models.service;

import com.project.apiresttaks.models.dao.Usuario;

import java.util.List;

public interface UsuarioService {
    List<Usuario> listarUsuario();

    Usuario obtenerUsuarioPorId(Integer id);

    Usuario guardarUsuario(Usuario usuario);

    Usuario actualizarUsuario(Integer id, Usuario usuario);

    void eliminarUsuario(Integer id);

    Usuario login(String mail, String password);
}
