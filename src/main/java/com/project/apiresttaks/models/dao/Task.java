package com.project.apiresttaks.models.dao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.sql.Date;
import java.text.DateFormat;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_tasks")
public class Task implements Serializable {
    @Id
    @Column(name = "id_task")
    private String idTask;

    @Column(name = "nomb_task",length = 150)
    private String nombTask;

    @Column(name = "desc_task",length = 150)
    private String descripcion;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_estado")
    private Estado estado;

    @Column(name = "ini_task")
    @DateTimeFormat(pattern = "YYYY-MM-DD")
    private Date inicio;

    @Column(name = "fin_task")
    @DateTimeFormat(pattern = "YYYY-MM-DD")
    private Date fin;

    @Column(name = "comp_task")
    private Boolean compartir;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_icono")
    private Icono icono;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_usua")
    private Usuario usuario;
    private static final long serialVersionUID = 1L;
}
