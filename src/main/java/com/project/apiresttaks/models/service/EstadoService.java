package com.project.apiresttaks.models.service;

import com.project.apiresttaks.models.dao.Estado;

import java.util.List;

public interface EstadoService {
    List<Estado> listarEstado();
    Estado obtenerEstadoPorId(Integer id);
    Estado guardarEstado(Estado estado);
    Estado actualizarEstado(Integer id, Estado estado);
    void eliminarEstado(Integer id);
}
