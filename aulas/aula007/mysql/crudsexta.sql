DROP DATABASE IF EXISTS CRUDSEXTA;

CREATE DATABASE CRUDSEXTA;
USE CRUDSEXTA;

CREATE TABLE alunos(
	mat INT PRIMARY KEY AUTO_INCREMENT,
    nome CHAR(100), -- Usa-se CHAR para priorizar processamento em vez de armazenamento, o CHAR não faz validação de caractere toda vez que tem entrada de dados
    idade INT,
    email CHAR(100) -- O VARCHAR prioriza espaço porque ele libera os caracteres não usados, só que usa mais processamento para fazer essa validação toda vez
);