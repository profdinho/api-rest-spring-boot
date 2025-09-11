# API REST Spring Boot - Gerenciamento de Usuários

Este projeto é uma API REST simples desenvolvida com Spring Boot para gerenciar usuários.

## Tecnologias Utilizadas

- Java
- Spring Boot
- Maven

## Como Executar

1. Clone o repositório:
```bash
git clone  https://github.com/profdinho/api-rest-spring-boot.git
```
2. Acesse a pasta do projeto:
```bash
cd api-rest-spring-boot
```
3. Compile e execute o projeto:
```bash
mvn spring-boot:run
```
## Endpoints

- `GET /api/users`  
  Lista todos os usuários.

- `POST /api/users`  
  Cria um novo usuário.  
  Exemplo de corpo da requisição:
  ```json
  {
    "nome": "João",
    "email": "joao@email.com"
  }
    ```
- `DELETE /api/users/{id}`  
  Remove um usuário pelo ID.
