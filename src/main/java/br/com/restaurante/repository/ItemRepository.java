package br.com.restaurante.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import br.com.restaurante.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long>{
    @Query("SELECT i FROM Item i WHERE i.status = 'ADICIONANDO' ")
    List<Item> findItensStatusAdicionado();

}
