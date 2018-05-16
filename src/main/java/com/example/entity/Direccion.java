package com.example.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document(collection="direccion")
final class Direccion {

    @Id
    private String idDireccion;

    private String titulo;
    private String direccion;
    private String calle;
    private String telefono;
    private String comuna;
    private String pais;

    @PersistenceConstructor
    public Direccion(String idDireccion, String titulo, String direccion, String calle, String telefono, String comuna, String pais) {
        this.idDireccion = idDireccion;
        this.direccion = direccion;
        this.calle = calle;
        this.telefono = telefono;
        this.comuna = comuna;
        this.pais = pais;
        this.titulo = titulo;
    }

    public String getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(String idDireccion) {
        this.idDireccion = idDireccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "idDireccion='" + idDireccion + '\'' +
                ", titulo='" + titulo + '\'' +
                ", direccion='" + direccion + '\'' +
                ", calle='" + calle + '\'' +
                ", telefono='" + telefono + '\'' +
                ", comuna='" + comuna + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}