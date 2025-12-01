package devgabriel.msprodutos.repository;

import devgabriel.msprodutos.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
