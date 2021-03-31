package generation.br.com.farmacia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import generation.br.com.farmacia.model.Produto;
import generation.br.com.farmacia.repository.ProdutoRepository;

@RestController
@RequestMapping ("/produtos")
@CrossOrigin("*")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository repository;
	
	@GetMapping("/{id}")
	public ResponseEntity<Produto> GetById(@PathVariable long id){
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/nome/{nomeProduto}")
	public ResponseEntity<List<Produto>> GetbyTitulo(@PathVariable String nomeProduto){
		return ResponseEntity.ok(repository.findAllByNomeProdutoContainingIgnoreCase(nomeProduto));
	}
	
	@GetMapping("/precoMaior/{preco}")
	public ResponseEntity<List<Produto>> GetAllByPrecoMaior(@PathVariable int preco){
		return ResponseEntity.ok(repository.findAllByPrecoGreaterThanEqual(preco));
	}
	
	@GetMapping("/precoMenor/{preco}")
	public ResponseEntity<List<Produto>> GetAllByPrecoLess(@PathVariable int preco){
		return ResponseEntity.ok(repository.findAllByPrecoLessThanEqual(preco));
	}
	
	@GetMapping("/ativo/{ativo}")
	public ResponseEntity<List<Produto>> GetAllByAtivo(@PathVariable boolean ativo){
		return ResponseEntity.ok(repository.findAllByAtivo(ativo));
	}
}
