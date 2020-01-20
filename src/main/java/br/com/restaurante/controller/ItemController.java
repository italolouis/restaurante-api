package br.com.restaurante.controller;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import br.com.restaurante.model.Item;
import br.com.restaurante.service.ItemService;

@RestController
@RequestMapping("/itens")
public class ItemController {
	@Autowired
	private ItemService itemService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Item> adicionarItem(@Valid @RequestBody Item item, HttpServletResponse response) {
		Item itemSalvo = itemService.insereItens(item);
		return ResponseEntity.status(HttpStatus.CREATED).body(itemSalvo);
	}
	
}
