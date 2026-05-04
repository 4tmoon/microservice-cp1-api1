package br.com.fiap.cp1_ap1.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "atividades")
public class Atividade {

    @Id
    @Column(name = "id_atividade")
    private Long idAtividade;

    @Nullable
    @Column(name = "titulo_atividade")
    private String tituloAtividade;

    @Column(name = "descricao_atividade")
    private String descAtividade;

    private Double nota;

    private String status;

}
