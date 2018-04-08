package com.example.services;

import com.example.entity.Saludo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface SaludoService {

     public ArrayList<Saludo> getListaSaludos();
     public String saltar();
     public String jugar();

}
