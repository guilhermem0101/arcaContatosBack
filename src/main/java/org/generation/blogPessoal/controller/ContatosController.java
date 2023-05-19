package org.generation.blogPessoal.controller;

import java.util.List;

import org.generation.blogPessoal.model.Contatos;
import org.generation.blogPessoal.repository.ContatosRepository;
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
@RequestMapping("/contatos")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ContatosController {

    @Autowired
    private ContatosRepository repository;

    
    //Get
    @GetMapping
    public ResponseEntity<List<Contatos>> GetAll(){
        return ResponseEntity.ok(repository.findAll());
    }
    
    // Get Filter
    @GetMapping("/{id}")
    public ResponseEntity<Contatos> GetById(@PathVariable long id){
    	return repository.findById(id)
    			.map(resp ->ResponseEntity.ok(resp)).
    			 orElse(ResponseEntity.notFound().build());
    }
    @GetMapping("/numero/{numero}")
    public ResponseEntity<List<Contatos>> GetByNumero(@PathVariable String numero){
    	return ResponseEntity.ok(repository.findAllByNumeroCContainingIgnoreCase(numero));
    }
   
    //resto
    @PostMapping
    public ResponseEntity<Contatos> post (@RequestBody Contatos contatos){
    	return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(contatos));
    }
    
    @PutMapping
    public ResponseEntity<Contatos> put (@RequestBody Contatos contatos){
    	return ResponseEntity.status(HttpStatus.OK).body(repository.save(contatos));
    }
    
    @DeleteMapping("/{id}") 
    public void delete (@PathVariable long id) {
    	repository.deleteById(id);
    }
}	


