package Loja.GameStore.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity // Declarando que a classe será uma Entidade do JPA
@Table(name = "Categoria") // Que esta entidade dentro do banco de dados vai se tornar uma tabela com o dado nome como parametro

public class Categoria {
	
	@Id // Id dentro do banco de dados
	@GeneratedValue (strategy = GenerationType.IDENTITY) // A chave primária 
	private Long id;
	
	@OneToMany(mappedBy = "categoriaDoProduto")
	@JsonIgnoreProperties ("categoriaDoproduto")
	private List<Produto> produtos;
	

	@NotNull
	private String nome;

	@NotNull
	private String genero;
	
	@NotNull
	private String console;
	
	
	@NotNull
	private String descricao;
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
