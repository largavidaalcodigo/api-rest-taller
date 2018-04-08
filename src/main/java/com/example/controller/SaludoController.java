package com.example.controller;

import com.example.services.SaludoService;
import com.example.services.SaludoServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@RestController
@RequestMapping("/demo")
public class SaludoController {
    private static final Logger logger = LoggerFactory.getLogger(SpringBootHelloWorldApplication.class);

    //@Autowired
    //SaludoService saludoService;

    @RequestMapping("/getSaludos")
    public ModelAndView prueba(Map<String, Object> model) {
        SaludoServiceImpl saludoService = new SaludoServiceImpl();

        logger.info("Consultando metodo prueba()...");
        model.put("listaSaludos", saludoService.getListaSaludos());

        return new ModelAndView("saludo");
    }

    //@RequestMapping("/hello/{player}")
    //public Message message(@PathVariable String player) {//REST Endpoint.
}