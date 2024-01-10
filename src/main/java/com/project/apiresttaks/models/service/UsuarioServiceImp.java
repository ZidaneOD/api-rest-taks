package com.project.apiresttaks.models.service;

import com.project.apiresttaks.models.dao.Usuario;
import com.project.apiresttaks.models.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

@Service
public class UsuarioServiceImp implements UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Usuario> listarUsuario() {
        return usuarioRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Usuario obtenerUsuarioPorId(Integer id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Usuario guardarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    @Transactional
    public Usuario actualizarUsuario(Integer id, Usuario usuario) {
        Usuario usuarioBD = usuarioRepository.findById(id).get();
        if (Objects.nonNull(usuario.getNombres()) && !"".equalsIgnoreCase(usuario.getNombres())) {
            usuarioBD.setNombres(usuario.getNombres());
        }
        if (Objects.nonNull(usuario.getApellidos()) && !"".equalsIgnoreCase(usuario.getApellidos())) {
            usuarioBD.setApellidos(usuario.getApellidos());
        }
        if (Objects.nonNull(usuario.getNombEmpresa()) && !"".equalsIgnoreCase(usuario.getNombEmpresa())) {
            usuarioBD.setNombEmpresa(usuario.getNombEmpresa());
        }
        if (Objects.nonNull(usuario.getCargoEmpresa()) && !"".equalsIgnoreCase(usuario.getCargoEmpresa())) {
            usuarioBD.setCargoEmpresa(usuario.getCargoEmpresa());
        }
        if (Objects.nonNull(usuario.getTelefono()) && !"".equalsIgnoreCase(usuario.getTelefono())) {
            usuarioBD.setTelefono(usuario.getTelefono());
        }
        if (Objects.nonNull(usuario.getMail()) && !"".equalsIgnoreCase(usuario.getMail())) {
            usuarioBD.setMail(usuario.getMail());
        }
        if (Objects.nonNull(usuario.getPassword()) && !"".equalsIgnoreCase(usuario.getPassword())) {
            usuarioBD.setPassword(usuario.getPassword());
        }
        return usuarioRepository.save(usuarioBD);
    }

    @Override
    @Transactional
    public void eliminarUsuario(Integer id) {
        usuarioRepository.deleteById(id);
    }

    @Override
    public Usuario login(String mail, String password) {
        return usuarioRepository.findByMailAndPassword(mail, password).orElse(null);
    }

}
