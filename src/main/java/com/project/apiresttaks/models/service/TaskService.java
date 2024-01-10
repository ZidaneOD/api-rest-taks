package com.project.apiresttaks.models.service;

import com.project.apiresttaks.models.dao.Task;

import java.util.List;
import java.util.Optional;

public interface TaskService {
    List<Task> listarTasks();

    Task obtenerTaskPorId(String id);

    Task guardarTask(Task task);

    Task actualizarTask(String id, Task task);

    void eliminarTask(String id);

    List<Task> listarFiltro(com.project.apiresttaks.Request.Task task);
}
