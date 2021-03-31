package generation.br.com.farmacia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import generation.br.com.farmacia.model.Marca;

public interface MarcaRepository extends JpaRepository<Marca, Long> {
	

}
