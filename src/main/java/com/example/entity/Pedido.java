package com.example.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection="pedido")
public class Pedido{

    @Id
    private int id;
    private String description;
    private String title;

    @PersistenceConstructor
    public Pedido(int id, String description, String title) {
        this.id = id;
        this.description = description;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}