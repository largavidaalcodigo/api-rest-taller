package com.example.services;

import com.example.entity.Pedido;
import java.util.List;

public interface PedidoService {
    Pedido save(Pedido pedido);
    Pedido findbyId(int id);
    Pedido delete(int id);
    List findAll();
}
