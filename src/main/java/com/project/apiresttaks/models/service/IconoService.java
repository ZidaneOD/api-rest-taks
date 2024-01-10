package com.project.apiresttaks.models.service;

import com.project.apiresttaks.models.dao.Icono;

import java.util.List;

public interface IconoService {
    List<Icono> listarIcono();
    Icono obtenerIconoPorId(Integer id);
    Icono guardarIcono(Icono Icono);
    Icono actualizarIcono(Integer id, Icono Icono);
    void eliminarIcono(Integer id);
}
