# To-Do List

## Descrição

Este projeto é uma aplicação de lista de tarefas (To-Do List) desenvolvida como **[desafio-junior-backend-simplify](https://github.com/simplify-tec/desafio-junior-backend-simplify)**.  
O objetivo é realizar operações básicas de gerenciamento de tarefas, como criar, editar, listar e excluir.

## Tecnologias Utilizadas

- **Backend**: Java com Spring Boot
- **Banco de Dados**: PostgreSQL
- **JPA (Hibernate)**: Para persistência dos dados
- **API**: Exposição de uma API RESTful

## Como Executar a Aplicação

1. **Clone o repositório**:

   ```bash
   git clone https://github.com/sua-conta/todolist.git

2. Certifique-se de que o PostgreSQL esteja rodando e o banco de dados todolist esteja criado. No arquivo application.properties, configure as credenciais do seu banco de dados.
   
  ```bash
spring.datasource.url=jdbc:postgresql://localhost:5432/todolist
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
```
3. Inicie o servidor
   ```bash
   mvn spring-boot:run
   ```
  ## Rotas da API 
  - **GET /tarefas** - Listar todas as tarefas.
  - **POST /tarefas** - Criar uma nova tarefa.
  - **PUT /tarefas/{id}** - Atualizar uma tarefa existente.
  - **DELETE /tarefas/{id}** - Deletar uma nova tarefa.
