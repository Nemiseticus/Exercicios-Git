package generation.br.com.farmacia.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import generation.br.com.farmacia.model.Categoria;
import generation.br.com.farmacia.model.Produto;
import generation.br.com.farmacia.repository.CategoriaRepository;
import generation.br.com.farmacia.repository.ProdutoRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria cadastroProdutoCategoria(long categoriaId, long produtoId) {
		Optional<Produto> produtoExistente = produtoRepository.findById(produtoId);
		Optional<Categoria> categoriaExistente = categoriaRepository.findById(categoriaId);
		
		if (produtoExistente.isPresent()&&categoriaExistente.isPresent()) {
			
			categoriaExistente.get().getProdutos().add(produtoExistente.get());
			
			categoriaRepository.save(categoriaExistente.get());
			
			return categoriaRepository.save(categoriaExistente.get());
		}
		
		return null;
	}
	

}
