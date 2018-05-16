package com.example.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Document(collection="cliente")
public class Cliente {

    @Id
    private int id;
    private String rut;
    private String razonSocial;
    private String nombreFantasia;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private Date fechaNacimiento;
    private String telefonoCasa;
    private String telefonoMovil;
    private String email;
    private String idEstado;

    private Date fechaUltimoCambio;

    @DBRef(db="direccion")
    private List<Direccion> listaDirecciones = new ArrayList<>();

    @DBRef(db="pedido")
    private List<Pedido> listaPedidos = new ArrayList<>();

    public Cliente() {
    }



    @PersistenceConstructor

    public Cliente(int id, String rut, String razonSocial, String nombreFantasia, String apellidoPaterno, String apellidoMaterno, Date fechaNacimiento, String telefonoCasa, String telefonoMovil, String email) {
        this.id = id;
        this.rut = rut;
        this.razonSocial = razonSocial;
        this.nombreFantasia = nombreFantasia;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaNacimiento = fechaNacimiento;
        this.telefonoCasa = telefonoCasa;
        this.telefonoMovil = telefonoMovil;
        this.email = email;
    }



    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", rut='" + rut + '\'' +
                ", razonSocial='" + razonSocial + '\'' +
                ", nombreFantasia='" + nombreFantasia + '\'' +
                ", apellidoPaterno='" + apellidoPaterno + '\'' +
                ", apellidoMaterno='" + apellidoMaterno + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", telefonoCasa='" + telefonoCasa + '\'' +
                ", telefonoMovil='" + telefonoMovil + '\'' +
                ", email='" + email + '\'' +
                ", idEstado='" + idEstado + '\'' +
                ", fechaUltimoCambio=" + fechaUltimoCambio +
                ", listaDirecciones=" + listaDirecciones +
                ", listaPedidos=" + listaPedidos +
                '}';
    }
}