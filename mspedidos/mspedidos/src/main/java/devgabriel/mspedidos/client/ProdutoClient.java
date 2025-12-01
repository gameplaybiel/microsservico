package devgabriel.mspedidos.client;

import devgabriel.mspedidos.dto.ProdutoResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class ProdutoClient {
    private final WebClient webClient = WebClient.create("http://localhost:8083");

    public ProdutoResponse buscarPorId(Long id){
        return webClient.get()
                .uri("/produtos/{id}", id)
                .retrieve()
                .bodyToMono(ProdutoResponse.class)
                .block();
    }
}
