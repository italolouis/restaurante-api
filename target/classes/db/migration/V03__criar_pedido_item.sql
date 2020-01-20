CREATE TABLE pedido_item(
	codpedido BIGINT(20),
    coditem BIGINT(20),
	primary key (codpedido, coditem)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*ALTER TABLE pedido_item
ADD CONSTRAINT fk_pedido_item_pedi
FOREIGN KEY (codpedido) REFERENCES pedido(id);

ALTER TABLE pedido_item
ADD CONSTRAINT fk_pedido_item_item
FOREIGN KEY (coditem) REFERENCES item(id);*/