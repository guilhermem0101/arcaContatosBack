package org.generation.blogPessoal.repository;




import java.util.List;

import org.generation.blogPessoal.model.Usuario;
import org.generation.blogPessoal.model.Vendas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendasRepository extends JpaRepository<Vendas, Long> { 
	public List<Vendas> findAllByUsuario (Usuario usuario);

}