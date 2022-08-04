USE PIZZARIA_DB
GO

CREATE TABLE  Aliments (

	idAliments INT IDENTITY(1,1),
	nom VARCHAR(20) not null,
	idPizza INT not null,
	CONSTRAINT FK_Id_Pizza FOREIGN KEY(idPizza) REFERENCES Pizza(idPizza),
);