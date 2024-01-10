package com.project.apiresttaks.Request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    private String idTask;
    private String nombTask;
    private String nombEstado;
    private String nombIcono;
    private Date inicioStart;
    private Date finEnd;
}
