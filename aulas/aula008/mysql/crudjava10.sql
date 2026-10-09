DROP DATABASE IF EXISTS crudjava10;
CREATE DATABASE crudjava10;
USE crudjava10;

CREATE TABLE aluno(
	codigo int PRIMARY KEY AUTO_INCREMENT,
    nome char(80),
    email char(80)
);