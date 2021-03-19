package org.generation.blogPessoal.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity // Solicita um banco de dados. 
@Table(name = "postagem") // que tenha o nome 

public class Postagem {

	@Id // (que tera id)  que automaticamente coloca como chave primária. 
	@GeneratedValue(strategy = GenerationType.IDENTITY) //auto_increment
	
	private Long id;
	
	@NotNull
	@Size(min = 5, max = 100) //Quantidade de caracteres.
	private String titulo;
	
	
	@NotNull
	@Size(min = 10, max = 500)
	private String texto;
	
	
	@Temporal(TemporalType.TIMESTAMP) // retorna os dados de data/horario que estao no seu pc
	private Date data = new java.sql.Date(System.currentTimeMillis());

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
	
	
	
	
}
