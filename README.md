Sistema de Cadastro em Java (MVC + MySQL)

Este é um sistema de cadastro desenvolvido em Java seguindo o padrão MVC (Model-View-Controller) e integrado a um banco de dados MySQL local, gerenciado pelo MySQL Workbench.

Funcionalidades

Cadastrar usuários com nome, e-mail e senha.

Listar usuários cadastrados no banco de dados.

Atualizar dados de um usuário existente.

Remover usuários do sistema.

Tecnologias Utilizadas

Java SE 8+

JDBC (Java Database Connectivity) para integração com o banco de dados.

MySQL Workbench para gerenciamento do banco de dados.

Estrutura do Projeto (MVC)

Model: Representa a entidade de usuário e a conexão com o banco de dados.

View: Interface simples baseada no terminal para interação com o usuário.

Controller: Gerencia as regras de negócio e comunicação entre a View e o Model.

Como Configurar e Executar

1. Configurar o Banco de Dados MySQL

Abra o MySQL Workbench e crie um banco de dados:

CREATE DATABASE cadastro_usuarios;

Use o banco de dados e crie a tabela de usuários:

USE cadastro_usuarios;
CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    senha VARCHAR(255) NOT NULL
);

2. Configurar a Conexão no Código

No arquivo responsável pela conexão (exemplo: DatabaseConnection.java), configure as credenciais do banco:

String url = "jdbc:mysql://localhost:3306/cadastro_usuarios";
String usuario = "seu_usuario";
String senha = "sua_senha";
Connection conexao = DriverManager.getConnection(url, usuario, senha);

Observação: Certifique-se de que o MySQL Server esteja rodando e que as credenciais estejam corretas.

3. Executar o Sistema

Compile e execute o código Java.

Utilize o menu no terminal para interagir com o sistema:

[1] Cadastrar usuário

[2] Listar usuários

[3] Atualizar usuário

[4] Remover usuário

[5] Sair

Possíveis Melhorias

Implementar uma interface gráfica com JavaFX ou Swing.

Utilizar JPA/Hibernate para facilitar a persistência de dados.

Adicionar criptografia para armazenar senhas com BCrypt.

Licença

Este projeto é de código aberto e pode ser usado e modificado livremente.
