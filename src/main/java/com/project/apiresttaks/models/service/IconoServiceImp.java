package com.project.apiresttaks.models.service;

import com.project.apiresttaks.models.dao.Icono;
import com.project.apiresttaks.models.repository.IconoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
@Service
public class IconoServiceImp implements IconoService {
    @Autowired
    private IconoRepository iconoRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Icono> listarIcono() {
        return iconoRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Icono obtenerIconoPorId(Integer id) {
        return iconoRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Icono guardarIcono(Icono icono) {
        return iconoRepository.save(icono);
    }

    @Override
    @Transactional
    public Icono actualizarIcono(Integer id, Icono icono) {
        Icono iconoBD = iconoRepository.findById(id).get();
        if (Objects.nonNull(icono.getNombIcono()) && !"".equalsIgnoreCase(icono.getNombIcono())) {
            iconoBD.setNombIcono(icono.getNombIcono());
        }
        return iconoRepository.save(iconoBD);
    }

    @Override
    @Transactional
    public void eliminarIcono(Integer id) {
        iconoRepository.deleteById(id);
    }
}
