package br.com.fiap.cp1_ap1.controller;

import br.com.fiap.cp1_ap1.model.Atividade;
import br.com.fiap.cp1_ap1.repository.AtividadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/atividades")
public class AtividadeController {

    @Autowired
    private AtividadeRepository repository;

    @GetMapping
    public ResponseEntity<List<Atividade>> findAll() {
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Atividade> findById(@PathVariable Long id) {
        return repository.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Atividade> create(@RequestBody Atividade atividade) {
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(atividade));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Atividade> atualizar(@PathVariable Long id, @RequestBody Atividade atividade) {
        return repository.findById(id)
                .map(a -> {
                    a.setDescAtividade(atividade.getDescAtividade());
                    a.setTituloAtividade(atividade.getTituloAtividade());
                    a.setStatus(atividade.getStatus());
                    a.setNota(atividade.getNota());

                    Atividade atualizado = repository.save(a);
                    return ResponseEntity.ok(atualizado);
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
