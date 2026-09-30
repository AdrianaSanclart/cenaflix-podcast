# Cenaflix Podcast

Sistema desktop em Java para cadastro, autenticação e consulta de podcasts. O projeto demonstra persistência com JPA/Hibernate, banco MySQL e interface gráfica Swing.

## Tecnologias

- Java
- Swing
- JPA e Hibernate
- MySQL
- Maven

## Funcionalidades

- Login de usuários
- Controle de tipo de acesso
- Cadastro de podcasts
- Listagem e consulta de registros
- Persistência com JPA

## Estrutura

- `src/`: código-fonte e telas Swing
- `database/`: script de criação do banco, sem credenciais pessoais
- `pom.xml`: dependências Maven

## Como executar

1. Crie o banco executando `database/cenaflixpodcast.sql`.
2. Configure usuário e senha locais em `src/META-INF/persistence.xml`.
3. Abra o projeto em uma IDE com suporte a Maven ou execute `mvn package`.
4. Execute a classe principal `com.mycompany.atvd3.Atvd3`.

O arquivo publicado contém `CHANGE_ME` no lugar de qualquer credencial. Não substitua esse valor por uma senha real em commits públicos.

## Observação

Projeto acadêmico reorganizado para fins de portfólio. Relatórios, arquivos de build e JavaDocs gerados foram mantidos fora do repositório.
