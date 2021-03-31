package generation.br.com.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import generation.br.com.farmacia.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	public List<Produto> findAllByNomeProdutoContainingIgnoreCase (String nomeProduto);
	
	public List<Produto> findAllByPrecoLessThanEqual (float preco);
	
	public List<Produto> findAllByPrecoGreaterThanEqual (float preco);
	
	@Query (value = "SELECT * FROM tb_produto WHERE ativo = :ativo", nativeQuery = true)
	public List<Produto> findAllByAtivo(@Param("ativo") boolean ativo);
	
	@Query (value = "SELECT * FROM tb_produto INNER JOIN tb_marca ON  tb_marca.id = tb_produto.marca_id WHERE tb_marca.descricao = :marca", nativeQuery = true)
	public List<Produto> findAllProdutoByCategoriaDecicao(@Param("marca") String marca);

}
