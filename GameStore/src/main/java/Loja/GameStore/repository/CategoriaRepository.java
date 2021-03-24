package Loja.GameStore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Loja.GameStore.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	public List<Categoria> findAllByNomeContainingIgnoreCase(String nome);
	
	public List<Categoria> findAllByDescricaoContainingIgnoreCase(String descricao);
	

}
