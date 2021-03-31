package generation.br.com.farmacia.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min = 5, max = 100)
	private String nomeProduto;
	
	@NotNull
	@Column (name = "preço", columnDefinition = "Decimal(6,2)")
	private float preco;
	
	private int quantidade;
	
	private boolean ativo;
	
	
	@ManyToOne
	@JsonIgnoreProperties("produtos")
	private Marca marca;
	
	@ManyToMany(mappedBy = "produtos", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JsonIgnoreProperties({"descricao","produtos"})
	private List<Categoria> categoriaProduto = new ArrayList<>();
}
