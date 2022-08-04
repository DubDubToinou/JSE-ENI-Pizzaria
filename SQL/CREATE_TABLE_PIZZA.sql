USE PIZZARIA_DB
GO

CREATE TABLE Pizza(
	idPizza INT PRIMARY KEY,
	nom VARCHAR(20) not null,
	prix float null,
	CONSTRAINT UN_idPizza UNIQUE (idPizza)

)