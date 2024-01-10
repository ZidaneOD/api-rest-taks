package com.project.apiresttaks.models.dao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_iconos")
public class Icono implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_icono")
    private Integer idIcono;

    @Column(name = "nomb_icono",length = 50)
    private String nombIcono;
    private static final long serialVersionUID = 1L;
}
