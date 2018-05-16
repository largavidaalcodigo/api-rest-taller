package com.example;

import com.example.entity.Pedido;
import com.example.repository.PedidoRepository;
import com.sun.media.jfxmedia.logging.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.config.EnableWebFlux;


@SpringBootApplication
@EnableWebFlux
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Bean
    CommandLineRunner init(PedidoRepository pedidoRepository) {

        return args -> {

            for (int i = 0; i < 5; i++)
                pedidoRepository.save(new Pedido(i, "descripc" + i, "titulo" + i));

            for (Pedido p : pedidoRepository.findAll()) {
                System.out.println(p.toString());
            }
        };

    }
}
