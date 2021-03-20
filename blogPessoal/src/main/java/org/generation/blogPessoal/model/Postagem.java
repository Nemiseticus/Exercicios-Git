package org.generation.blogPessoal.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity // Solicita um banco de dados. E indica que essa classe era uma entidade
@Table(name = "postagem") // que tenha o nome

public class Postagem {

	@Id // (que tera id) que automaticamente coloca como chave primária.
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment

	private Long id;

	@NotNull
	@Size(min = 5, max = 100) // Quantidade de caracteres.
	private String titulo;

	@NotNull
	@Size(min = 10, max = 500)
	private String texto;

	@Temporal(TemporalType.TIMESTAMP) // retorna os dados de data/horario que estao no seu pc
	private Date data = new java.sql.Date(System.currentTimeMillis());

	
	
	@ManyToOne // Cria uma releção de muitos pra um. Entre as tabelas
	@JsonIgnoreProperties("postagem") // Essa anotação serve para cessar o looping delimitando com parâmetro ("postagem") que está em properties 
	private Tema tema; // Uma variável chamada tema, do tipo da classe tema

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Date getDate() {
		return data;
	}

	public void setDate(Date data) {
		this.data = data;
	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

}
