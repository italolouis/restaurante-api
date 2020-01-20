package br.com.restaurante.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.restaurante.model.Item;
import br.com.restaurante.repository.ItemRepository;

@Service
public class ItemService {
	@Autowired
	private ItemRepository itemRepository;
	
	public Item insereItens(Item item) {
		Item itemSalvo = itemRepository.save(item);
		return itemSalvo;
	}
	
	public void removeItens(Long id) {
		itemRepository.delete(id);
	}
	
	public List<Item> buscarItensAdicionados(){
		return itemRepository.findItensStatusAdicionado();
	}

}
