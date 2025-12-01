# Microsserviço

Este projeto demonstra um ambiente com dois microsserviços independentes: mspedidos e msprodutos, realizando comunicação síncrona entre si via REST Client.

## 🎯 Objetivo

Implementar comunicação entre os serviços utilizando chamadas REST síncronas, garantindo integração simples e eficiente entre os domínios de Pedidos e Produtos.

## 🛠 Tecnologias Utilizadas
- Java 17
- Spring Boot
- Spring Web
- Spring Reactive Web
- Spring Data JPA
- Lombok
- PostgreSQL
- Flyway Migration

## Exemplo da execução:

Produtos em JSON: http://localhost:8083/produtos/1
```
{
  "id": 1,
  "nome": "Monitor",
  "preco": 1200.00
}
```

Pedidos em JSON: http://localhost:8084/pedidos?produtoId=1&quantidade=2
```
{
  "id": 2,
  "produtoId": 1,
  "quantidade": 3,
  "valorTotal": 3600.00
}
```

## 📚 Referência
- Vídeo: Construindo um sistema básico de microserviços em 15 minutos
- Link: https://www.youtube.com/watch?v=nJeN59Yuh8c