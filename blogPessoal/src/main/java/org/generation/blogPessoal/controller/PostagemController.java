package org.generation.blogPessoal.controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.generation.blogPessoal.model.Postagem;
import org.generation.blogPessoal.repository.PostagemRepository;
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
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestController  // Dizendo que esa classe se trata de um controlador
@RequestMapping("/postagens") // Caminho geral que a body/corpo vai ter conforme o parametro dentro dos parenteses . Quais comando/controlador vai ter no caminho.
@CrossOrigin("*") // Significa que i32ra aceitar requisições de qualquer lugar. Sem requisições
public class PostagemController {

	@Autowired  // Puxa e Autoriza/Permite instanciar todos os metodos dentro da interface, nesse caso, na classe interface. 
	private PostagemRepository repository;

	@GetMapping //Pega o caminho, e ja que não tem nenhum requisito, ele vai pegar todos os caminhos, discriminado na List
	public ResponseEntity<List<Postagem>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
			
	}

	@GetMapping("/{id}") //Pega o caminho discriminado, no caso id.
	public ResponseEntity<Postagem> GetById(@PathVariable long id){
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
				
	}
	
	@GetMapping("/titulo/{titulo}") //Pega o caminho discriminado, no caso titulo.
	public ResponseEntity<List<Postagem>> GetByTiulo(@PathVariable String titulo){ // @PathVariable: Fazer requisição pela URI
		return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));
	}
	
	@PostMapping // Posta, cria e salva no banco de dados.
	public ResponseEntity<Postagem> post (@RequestBody Postagem postagem){  //  @RequestBody: Precisa fazer a requisição no corpo.
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(postagem));
		
	}
	@PutMapping // Selecione e altera no corpo. 
	public ResponseEntity<Postagem> put (@RequestBody Postagem postagem){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(postagem));
		
	}
	
	@DeleteMapping ("/{id}") // Deleta conforma a requisição no caso ID.
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
}
