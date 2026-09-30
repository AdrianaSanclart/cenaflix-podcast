CREATE DATABASE IF NOT EXISTS cenaflixpodcast;
USE cenaflixpodcast;

CREATE TABLE podcast (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    produtor VARCHAR(45) NOT NULL,
    nome VARCHAR(45) NOT NULL,
    num INT NOT NULL,
    duracao TIME NOT NULL,
    url VARCHAR(100) NOT NULL
);

CREATE TABLE usuarios (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    login VARCHAR(45) NOT NULL,
    senha VARCHAR(45) NOT NULL,
    tipo VARCHAR(45) NOT NULL
);

-- Demo-only data. Replace credentials locally before using the application.
INSERT INTO usuarios (login, senha, tipo)
VALUES ('demo', 'CHANGE_ME', 'Administrador');
