# Projeto Web Services com Spring Boot, JPA e Hibernate

![Java](https://img.shields.io/badge/Java-21-blue) ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4.2-green) ![JPA](https://img.shields.io/badge/JPA-Hibernate-orange)

## 📌 Descrição
Este projeto é uma aplicação web baseada em **Spring Boot** que implementa um sistema de Web Services utilizando **JPA/Hibernate** para persistência de dados. Foi desenvolvido com o objetivo de praticar os conceitos fundamentais de desenvolvimento back-end, incluindo CRUD completo, tratamento de exceções, perfis de configuração e implantação na nuvem.

## 🎯 Objetivos do Projeto
- Criar um projeto Spring Boot com Java
- Implementar um modelo de domínio orientado a objetos
- Estruturar as camadas lógicas (Controller, Service e Repository)
- Configurar um banco de dados de testes (H2) e um banco de produção (PostgreSQL)
- Implementar operações CRUD para entidades do sistema
- Tratar exceções de forma adequada
- Implantar a aplicação na nuvem (Heroku)

## 🛠️ Tecnologias Utilizadas
- **Java 21**
- **Spring Boot 3.4.2**
- **JPA / Hibernate**
- **Banco de Dados H2 (testes) e PostgreSQL (produção)**
- **Maven**
- **Heroku (Deploy)**

## 📂 Estrutura do Projeto
O projeto segue a arquitetura MVC e está dividido nas seguintes camadas:

```
/src/main/java/com/seuusuario/seuprojeto
├── entities         # Classes do modelo de domínio
├── repositories     # Interfaces para acesso ao banco de dados
├── services         # Regras de negócio
├── resources        # Controladores REST
└── exceptions       # Classes para tratamento de exceções
```

## 🏗️ Modelagem do Domínio
As principais entidades implementadas no projeto são:
- **Usuário (`User`)**
- **Pedido (`Order`)**
- **Categoria (`Category`)**
- **Produto (`Product`)**
- **Item do Pedido (`OrderItem`)**
- **Pagamento (`Payment`)**

## 🔧 Configuração do Banco de Dados
### Testes (H2)
No ambiente de testes, utilizamos o banco de dados H2 em memória. As configurações estão no arquivo `application-test.properties`:
```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
```

### Produção (PostgreSQL)
No ambiente de produção, utilizamos um banco de dados PostgreSQL. As configurações estão no arquivo `application-prod.properties`:
```properties
spring.datasource.url=${DATABASE_URL}
spring.jpa.hibernate.ddl-auto=none
```

## 📜 Licença
Este projeto foi desenvolvido com fins educacionais, baseado no curso do professor **Nélio Alves** no [DevSuperior](https://devsuperior.com.br).

---
Desenvolvido por [Victor Hugo Aguiar Porfiro](https://github.com/VHAPorfirium). ✨

