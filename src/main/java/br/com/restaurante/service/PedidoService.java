package br.com.restaurante.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.restaurante.model.Pedido;
import br.com.restaurante.repository.ItemRepository;
import br.com.restaurante.repository.PedidoRepository;

@Service
public class PedidoService {
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@Autowired
	private ItemRepository itemRepository;
	
	public Pedido criarPedido(Pedido pedido) {
		Pedido pedidoSalvo = pedidoRepository.save(pedido);
		//Ao salvar o pedido atualizar os itens
		itemRepository.updateItens(pedidoSalvo.getId());
		return pedidoSalvo;
	}
	
	public List<Pedido> listarPedidos(){
		return pedidoRepository.findAll();
	}
	
}
