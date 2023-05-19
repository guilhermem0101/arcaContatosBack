package org.generation.blogPessoal.repository;

import java.util.List;

import org.generation.blogPessoal.model.Contatos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatosRepository extends JpaRepository<Contatos, Long> { 
    public List<Contatos> findAllByNomeCContainingIgnoreCase (String nomeC);
    public List<Contatos> findAllByNumeroCContainingIgnoreCase (String numero);

}