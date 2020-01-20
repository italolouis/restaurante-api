package br.com.restaurante.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.restaurante.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{
}
