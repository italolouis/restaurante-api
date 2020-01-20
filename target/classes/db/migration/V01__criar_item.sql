CREATE TABLE item(
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    produto_id BIGINT(20) NOT NULL, 
    nome VARCHAR(50),
    descricao VARCHAR(50),
    preco DECIMAL(10,2),
    categoria_id BIGINT(20),
    status VARCHAR(10)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
