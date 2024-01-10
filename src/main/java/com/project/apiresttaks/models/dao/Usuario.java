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
@Table(name = "tb_usuarios", uniqueConstraints = {@UniqueConstraint(columnNames = {"mail_usua"})})
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usua")
    private Integer idUsuario;

    @Column(name = "nomb_usua", length = 100)
    private String nombres;

    @Column(name = "appe_usua", length = 100)
    private String apellidos;

    @Column(name = "nomb_emp_usua", length = 100)
    private String nombEmpresa;

    @Column(name = "carg_emp_usua", length = 120)
    private String cargoEmpresa;

    @Column(name = "telf_usua", length = 15)
    private String telefono;

    @Column(name = "mail_usua", length = 200)
    private String mail;
    @Column(name = "pass_usua")
    private String password;

    private static final long serialVersionUID = 1L;

}
