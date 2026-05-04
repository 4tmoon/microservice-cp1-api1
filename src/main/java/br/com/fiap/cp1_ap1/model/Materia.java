package br.com.fiap.cp1_ap1.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "materias")
public class Materia {

    @Id
    @Column(name = "id_materia")
    private Long idMateria;

    @Nullable
    @Column(name = "nome_materia")
    private String nomeMateria;

    @Column(name = "descricao_materia")
    private String descMateria;

    @Column(name= "carga_horaria")
    private Long cargaHoraria;

    private String status;
}
