package com.project.apiresttaks.controllers;

import com.project.apiresttaks.models.dao.Usuario;
import com.project.apiresttaks.models.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioService UsuarioService;

    @GetMapping
    public List<Usuario> listar() {
        return UsuarioService.listarUsuario();
    }

    @GetMapping("/{id}")
    public Usuario buscar(@PathVariable Integer id) {
        return UsuarioService.obtenerUsuarioPorId(id);
    }

    @PostMapping
    public Usuario guardar(@RequestBody Usuario usuario) {
        return UsuarioService.guardarUsuario(usuario);
    }

    @PutMapping("/{id}")
    public Usuario actualizar(@PathVariable Integer id, @RequestBody Usuario usuario) {
        return UsuarioService.actualizarUsuario(id, usuario);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        UsuarioService.eliminarUsuario(id);
    }
}
