package br.com.restaurante.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.HttpStatus;
import br.com.restaurante.model.Pedido;
import br.com.restaurante.service.PedidoService;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
	@Autowired
	private PedidoService pedidoService;
	
	@CrossOrigin
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Pedido> adicionarItem(@Valid @RequestBody Pedido pedido, HttpServletResponse response) {
		Pedido pedidoSalvo = pedidoService.criarPedido(pedido);
		return ResponseEntity.status(HttpStatus.CREATED).body(pedidoSalvo);
	}
	
	@CrossOrigin
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> getPedidos() {
		List<Pedido> pedidos = pedidoService.listarPedidos();
		return !pedidos.isEmpty() ? ResponseEntity.ok(pedidos) : ResponseEntity.notFound().build();
	}
	
	
}
