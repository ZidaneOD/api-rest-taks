package com.project.apiresttaks.controllers;

import com.project.apiresttaks.models.dao.Task;
import com.project.apiresttaks.models.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/task")
public class TaskController {
    @Autowired
    private TaskService TaskService;

    @GetMapping
    public List<Task> listar() {
        return TaskService.listarTasks();
    }

    @GetMapping("/{id}")
    public Task buscar(@PathVariable String id) {
        return TaskService.obtenerTaskPorId(id);
    }

    @PostMapping
    public Task guardar(@RequestBody Task Task) {
        return TaskService.guardarTask(Task);
    }

    @PutMapping("/{id}")
    public Task actualizar(@PathVariable String id, @RequestBody Task task) {
        return TaskService.actualizarTask(id, task);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable String id) {
        TaskService.eliminarTask(id);
    }

    @GetMapping("/filtro")
    public List<Task> filtros(@RequestBody com.project.apiresttaks.Request.Task task) {
        return TaskService.listarFiltro(task);
    }


}
