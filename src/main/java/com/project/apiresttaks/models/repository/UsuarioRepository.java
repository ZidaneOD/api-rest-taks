package com.project.apiresttaks.models.repository;

import com.project.apiresttaks.models.dao.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Optional<Usuario> findByMailAndPassword(String mail, String password);
}
