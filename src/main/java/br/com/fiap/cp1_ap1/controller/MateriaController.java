package br.com.fiap.cp1_ap1.controller;

import br.com.fiap.cp1_ap1.model.Materia;
import br.com.fiap.cp1_ap1.repository.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/materias")
public class MateriaController {

    @Autowired
    private MateriaRepository repository;

    @GetMapping
    public ResponseEntity<List<Materia>> findAll() {
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Materia> findById(@PathVariable Long id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Materia> create(@RequestBody Materia materia) {
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(materia));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Materia> atualizar(@PathVariable Long id, @RequestBody Materia materia) {
        return repository.findById(id)
                .map(existente -> {
                    existente.setDescMateria(materia.getDescMateria());
                    existente.setStatus(materia.getStatus());
                    existente.setNomeMateria(materia.getNomeMateria());
                    existente.setCargaHoraria(materia.getCargaHoraria());
                    return ResponseEntity.ok(repository.save(existente));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        if (!repository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}