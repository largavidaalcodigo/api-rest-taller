package com.example.repository;

import com.example.entity.Pedido;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PedidoRepository extends MongoRepository<Pedido, Integer>, PedidoRepositoryCustom {


}