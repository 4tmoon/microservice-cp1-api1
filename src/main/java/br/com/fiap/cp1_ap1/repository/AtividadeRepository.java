package br.com.fiap.cp1_ap1.repository;

import br.com.fiap.cp1_ap1.model.Atividade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtividadeRepository extends JpaRepository<Atividade, Long> {
}
