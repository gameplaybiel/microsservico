package devgabriel.msprodutos.controller;

import devgabriel.msprodutos.model.Produto;
import devgabriel.msprodutos.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoRepository repository;

    public ProdutoController(ProdutoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Produto> listarProdutos(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Produto buscarPorId(@PathVariable Long id){
        return repository.findById(id).orElseThrow();
    }

    @PostMapping
    public Produto salvarProduto(@RequestBody Produto produto){
        return repository.save(produto);
    }
}
