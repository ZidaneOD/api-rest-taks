package com.project.apiresttaks.controllers;

import com.project.apiresttaks.models.dao.Estado;
import com.project.apiresttaks.models.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estado")
public class EstadoController {
    @Autowired
    private EstadoService estadoService;

    @GetMapping
    public List<Estado> listar() {
        return estadoService.listarEstado();
    }

    @GetMapping("/{id}")
    public Estado buscar(@PathVariable Integer id) {
        return estadoService.obtenerEstadoPorId(id);
    }

    @PostMapping
    public Estado guardar(@RequestBody Estado estado) {
        return estadoService.guardarEstado(estado);
    }

    @PutMapping("/{id}")
    public Estado actualizar(@PathVariable Integer id, @RequestBody Estado estado) {
        return estadoService.actualizarEstado(id, estado);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        estadoService.eliminarEstado(id);
    }

    @PostMapping(value = "demo")
    public String welcome() {
        return "Welcome from secure endpoint";
    }
}
