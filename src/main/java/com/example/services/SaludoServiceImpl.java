package com.example.services;
import com.example.entity.Saludo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

public class SaludoServiceImpl implements SaludoService {

    @Override
    public ArrayList<Saludo> getListaSaludos() {
        ArrayList<Saludo> saludos = new ArrayList<>();

        for(int i=0; i<30; i++){
            saludos.add(new Saludo(i, "Saludo nro. "+i));
        }
        return saludos;
    }

    @Override
    public String saltar() {
        return null;
    }

    @Override
    public String jugar() {
        return null;
    }
}
