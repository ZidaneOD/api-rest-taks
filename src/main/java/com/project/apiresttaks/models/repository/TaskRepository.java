package com.project.apiresttaks.models.repository;

import com.project.apiresttaks.models.dao.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, String> {
    @Query("""
            select t from Task t
            where upper(t.idTask) like upper(:idTask) or upper(t.nombTask) like upper(:nombTask) or upper(t.estado.nombEstado) like upper(:nombEstado) or upper(t.icono.nombIcono) like upper(:nombIcono) or t.inicio between (:inicioStart) and (:finEnd)""")
    @Nullable
    List<Task> Filtros(@Param("idTask") @Nullable String idTask,
                       @Param("nombTask") @Nullable String nombTask,
                       @Param("nombEstado") @Nullable String nombEstado,
                       @Param("nombIcono") @Nullable String nombIcono,
                       @Param("inicioStart") @Nullable Date inicioStart,
                       @Param("finEnd") @Nullable Date finEnd);

}
