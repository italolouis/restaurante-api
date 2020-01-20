package br.com.restaurante.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.restaurante.model.Pedido;
import br.com.restaurante.repository.PedidoRepository;

@Service
public class PedidoService {
	@Autowired
	private PedidoRepository pedidoRepository;
	
	public Pedido criarPedido(Pedido pedido) {
		Pedido pedidoSalvo = pedidoRepository.save(pedido);
		return pedidoSalvo;
	}
	
}
