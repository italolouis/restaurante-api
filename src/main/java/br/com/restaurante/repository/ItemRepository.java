package br.com.restaurante.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.restaurante.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long>{

}
