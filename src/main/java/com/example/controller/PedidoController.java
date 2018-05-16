package com.example.controller;

import com.example.entity.Pedido;
import com.example.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/"})
public class PedidoController {

    @Autowired
    PedidoService pedidoService;

    @RequestMapping(method = RequestMethod.GET, value = "/pedidos")
    public Iterable<Pedido> pedido() {
        return pedidoService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/pedidos")
    public Pedido save(@RequestBody Pedido pedido) {
        return pedidoService.save(pedido);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/pedidos/{id}")
    public Pedido show(@PathVariable int id) {
        return pedidoService.findbyId(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/pedidos/{id}")
    public Pedido update(@PathVariable int id, @RequestBody Pedido pedido) {
        //Pedido p = pedidoRepository.findOne(id);
        return pedido;
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/pedidos/{id}")
    public void delete(@PathVariable int id) {
        pedidoService.delete(id);
    }
}