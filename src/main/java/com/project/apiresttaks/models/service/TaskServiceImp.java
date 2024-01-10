package com.project.apiresttaks.models.service;

import com.project.apiresttaks.models.dao.Estado;
import com.project.apiresttaks.models.dao.Icono;
import com.project.apiresttaks.models.dao.Task;
import com.project.apiresttaks.models.dao.Usuario;
import com.project.apiresttaks.models.repository.EstadoRepository;
import com.project.apiresttaks.models.repository.IconoRepository;
import com.project.apiresttaks.models.repository.TaskRepository;
import com.project.apiresttaks.models.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class TaskServiceImp implements TaskService {
    @Autowired
    private TaskRepository taskRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private IconoRepository iconoRepository;
    @Autowired
    private EstadoRepository estadoRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Task> listarTasks() {
        return taskRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Task obtenerTaskPorId(String id) {
        return taskRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Task guardarTask(Task task) {
        task.setUsuario(buscarUsuario(task.getUsuario().getIdUsuario()));
        task.setEstado(buscarEstado(task.getEstado().getIdEstado()));
        task.setIcono(buscarIcono(task.getIcono().getIdIcono()));
        return taskRepository.save(task);
    }

    @Override
    @Transactional
    public Task actualizarTask(String id, Task task) {
        Task taskBD = taskRepository.findById(id).get();
        if (Objects.nonNull(task.getNombTask()) && !"".equalsIgnoreCase(task.getNombTask())) {
            taskBD.setNombTask(task.getNombTask());
        }
        if (Objects.nonNull(task.getDescripcion()) && !"".equalsIgnoreCase(task.getDescripcion())) {
            taskBD.setDescripcion(task.getDescripcion());
        }
        if (Objects.nonNull(task.getEstado())) {
            taskBD.setEstado(buscarEstado(task.getEstado().getIdEstado()));
        }
        if (Objects.nonNull(task.getInicio())) {
            taskBD.setInicio(task.getInicio());
        }
        if (Objects.nonNull(task.getFin())) {
            taskBD.setFin(task.getFin());
        }
        if (Objects.nonNull(task.getCompartir())) {
            taskBD.setCompartir(task.getCompartir());
        }
        if (Objects.nonNull(task.getIcono())) {
            taskBD.setIcono(buscarIcono(task.getIcono().getIdIcono()));
        }
        if (Objects.nonNull(task.getUsuario())) {
            taskBD.setUsuario(buscarUsuario(task.getUsuario().getIdUsuario()));
        }
        return taskRepository.save(taskBD);
    }

    @Override
    @Transactional
    public void eliminarTask(String id) {
        taskRepository.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Task> listarFiltro(com.project.apiresttaks.Request.Task task) {
        String idTask = "%" + task.getIdTask() + "%";
        String nombTask = "%" + task.getNombTask() + "%";
        String nombEstado = "%" + task.getNombEstado() + "%";
        String nombIcono = "%" + task.getNombIcono() + "%";
        Date inicioStart = task.getInicioStart();
        Date finEnd = task.getFinEnd();
        return taskRepository.Filtros(idTask, nombTask, nombEstado, nombIcono, inicioStart, finEnd);
    }

    private Estado buscarEstado(Integer id) {
        return estadoRepository.findById(id).get();
    }

    private Usuario buscarUsuario(Integer id) {
        return usuarioRepository.findById(id).get();
    }

    private Icono buscarIcono(Integer id) {
        return iconoRepository.findById(id).get();
    }
}
