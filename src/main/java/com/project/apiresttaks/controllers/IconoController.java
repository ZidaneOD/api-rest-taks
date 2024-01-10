package com.project.apiresttaks.controllers;

import com.project.apiresttaks.models.dao.Icono;
import com.project.apiresttaks.models.service.IconoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/icono")
public class IconoController {
    @Autowired
    private IconoService iconoService;

    @GetMapping
    public List<Icono> listar() {
        return iconoService.listarIcono();
    }

    @GetMapping("/{id}")
    public Icono buscar(@PathVariable Integer id) {
        return iconoService.obtenerIconoPorId(id);
    }

    @PostMapping
    public Icono guardar(@RequestBody Icono icono) {
        return iconoService.guardarIcono(icono);
    }

    @PutMapping("/{id}")
    public Icono actualizar(@PathVariable Integer id, @RequestBody Icono icono) {
        return iconoService.actualizarIcono(id, icono);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        iconoService.eliminarIcono(id);
    }
}
