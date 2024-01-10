package com.project.apiresttaks.controllers;

import com.project.apiresttaks.models.dao.Usuario;
import com.project.apiresttaks.models.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/login")
public class LoginController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public String login(@RequestBody Usuario usuario) {
        if (usuarioService.login(usuario.getMail(), usuario.getPassword()) != null) {
            return "LOGEADO: TOKEN";
        }
        return "CREDENCIALES ERRONEAS!";

    }
}
