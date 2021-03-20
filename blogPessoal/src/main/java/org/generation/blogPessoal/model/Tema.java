package org.generation.blogPessoal.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table (name = "tb_tema")
public class Tema {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	private String descricao;
	@OneToMany(mappedBy = "tema", cascade = CascadeType.ALL ) // Um para muitos com o parametro mappeBy, que direciona e libera a leitura de uma classe dentro dela, no caso "tema"
	// No metodo cascade Se por algum acaso formos alterar alguma coisa referente ao tema, significa que todas as postagens referente ao tema sofreram alteração.
	@JsonIgnoreProperties("tema")  // Essa anotação serve para cessar o looping delimitando com parâmetro ("tema") que está em properties 
	
	private List <Postagem> postagem;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Postagem> getPostagem() {
		return postagem;
	}

	public void setPostagem(List<Postagem> postagem) {
		this.postagem = postagem;
	}
}

	