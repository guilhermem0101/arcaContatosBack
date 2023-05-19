package org.generation.blogPessoal.controller;

import java.util.List;

import org.generation.blogPessoal.model.Usuario;
import org.generation.blogPessoal.model.Vendas;
import org.generation.blogPessoal.repository.VendasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/vendas")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class VendasController {
    @Autowired
    
    private VendasRepository repository;
    
    @GetMapping
    public ResponseEntity<List<Vendas>> GetAll(){
        return ResponseEntity.ok(repository.findAll());
    }
    
    
    @GetMapping("/{usuario}")
    public ResponseEntity <List<Vendas>>GetByUsuario(@PathVariable Usuario usuario){
    	return ResponseEntity.ok(repository.findAllByUsuario(usuario));
    }
    
    @PostMapping
    public ResponseEntity<Vendas> post(@RequestBody Vendas vendas) {
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(vendas));
    }

    @PutMapping
    public ResponseEntity<Vendas> put(@RequestBody Vendas vendas) {
        return ResponseEntity.status(HttpStatus.OK).body(repository.save(vendas));
    }

    
    
    
    @DeleteMapping("/{id}") 
    public void delete (@PathVariable long id) {
    	repository.deleteById(id);
    }
}
