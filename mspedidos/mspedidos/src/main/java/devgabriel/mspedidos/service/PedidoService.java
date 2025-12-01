package devgabriel.mspedidos.service;

import devgabriel.mspedidos.client.ProdutoClient;
import devgabriel.mspedidos.dto.ProdutoResponse;
import devgabriel.mspedidos.model.Pedido;
import devgabriel.mspedidos.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class PedidoService {
    private final PedidoRepository pedidoRepository;
    private final ProdutoClient produtoClient;

    public PedidoService(PedidoRepository pedidoRepository, ProdutoClient produtoClient) {
        this.pedidoRepository = pedidoRepository;
        this.produtoClient = produtoClient;
    }

    public Pedido criarPedido(Long produtoId, Integer quantidade){
        ProdutoResponse produtoResponse = produtoClient.buscarPorId(produtoId);
        Pedido pedido = new Pedido();
        pedido.setProdutoId(produtoId);
        pedido.setQuantidade(quantidade);
        pedido.setValorTotal(produtoResponse.preco().multiply(new BigDecimal(quantidade)));
        return pedidoRepository.save(pedido);
    }
}
