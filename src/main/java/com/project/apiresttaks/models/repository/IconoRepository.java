package com.project.apiresttaks.models.repository;

import com.project.apiresttaks.models.dao.Icono;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IconoRepository extends JpaRepository<Icono,Integer> {
}
