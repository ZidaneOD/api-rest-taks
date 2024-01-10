package com.project.apiresttaks.models.service;

import com.project.apiresttaks.models.dao.Estado;
import com.project.apiresttaks.models.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
@Service
public class EstadoServiceImp implements EstadoService {
    @Autowired
    private EstadoRepository estadoRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Estado> listarEstado() {
        return estadoRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Estado obtenerEstadoPorId(Integer id) {
        return estadoRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Estado guardarEstado(Estado estado) {
        return estadoRepository.save(estado);
    }

    @Override
    @Transactional
    public Estado actualizarEstado(Integer id, Estado estado) {
        Estado estadoBD = estadoRepository.findById(id).get();
        if (Objects.nonNull(estado.getNombEstado()) && !"".equalsIgnoreCase(estado.getNombEstado())) {
            estadoBD.setNombEstado(estado.getNombEstado());
        }
        return estadoRepository.save(estadoBD);
    }

    @Override
    @Transactional
    public void eliminarEstado(Integer id) {
        estadoRepository.deleteById(id);
    }
}
