# 📋 CRUD de Usuários com Spring Boot

API REST completa para gerenciamento de usuários, desenvolvida com Java e Spring Boot.
Essa foi a minha primeira aplicação de fato com Java, um primeiro projeto com framework, fiz esssa criação de uma API Rest com Spring Boot.

## 🚀 Tecnologias

- **Java 17+**
- **Spring Boot**
- **Spring Web (REST)**
- **Maven**

## 📌 Funcionalidades

- ✅ Listar todos os usuários
- ✅ Buscar usuário por ID
- ✅ Criar novo usuário
- ✅ Atualizar usuário existente
- ✅ Deletar usuário

## 🛠️ Como executar o projeto

### Pré-requisitos

- Java 17 ou superior instalado
- Maven instalado
- IntelliJ IDEA (recomendado) ou qualquer IDE Java

### Passos

```bash
# Clone o repositório
git clone https://github.com/C-Cdev/crud-springboot-java.git

# Acesse a pasta do projeto
cd crud-springboot-java

# Execute o projeto
./mvnw spring-boot:run
```

A API estará disponível em: `http://localhost:8080`

## 📡 Endpoints

| Método | Rota | Descrição |
|--------|------|-----------|
| GET | `/usuarios` | Lista todos os usuários |
| GET | `/usuarios/{id}` | Busca usuário por ID |
| POST | `/usuarios` | Cria novo usuário |
| PUT | `/usuarios/{id}` | Atualiza usuário existente |
| DELETE | `/usuarios/{id}` | Deleta usuário |

## 📝 Exemplos de uso

### Criar usuário (POST)
```json
POST /usuarios
Content-Type: application/json

{
  "nome": "Ana Silva",
  "email": "ana@email.com"
}
```

### Resposta
```json
{
  "id": 1,
  "nome": "Ana Silva",
  "email": "ana@email.com"
}
```

### Atualizar usuário (PUT)
```json
PUT /usuarios/1
Content-Type: application/json

{
  "nome": "Ana Souza",
  "email": "ana.souza@email.com"
}
```

## 🗂️ Estrutura do projeto

```
src/
└── main/
    └── java/
        └── com/example/demo/
            ├── DemoApplication.java
            ├── controller/
            │   └── UsuarioController.java
            ├── model/
            │   └── Usuario.java
            ├── repository/
            │   └── UsuarioRepository.java
            └── service/
                └── UsuarioService.java
```

## 📚 Arquitetura

O projeto segue o padrão de arquitetura em camadas:

- **Controller** — recebe as requisições HTTP e retorna as respostas
- **Service** — contém as regras de negócio
- **Repository** — responsável pelo acesso e armazenamento dos dados
- **Model** — representa a entidade de domínio

## ⚠️ Observação

Os dados são armazenados em memória. Ao reiniciar o servidor, os dados são perdidos. Em uma versão futura, será integrado um banco de dados relacional com Spring Data JPA.

## 👨‍💻 Autor

Feito por [Caio Melo](https://github.com/C-Cdev)
