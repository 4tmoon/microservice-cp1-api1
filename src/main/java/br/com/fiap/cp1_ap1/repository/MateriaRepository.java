package br.com.fiap.cp1_ap1.repository;

import br.com.fiap.cp1_ap1.model.Materia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MateriaRepository extends JpaRepository <Materia, Long> {
}
