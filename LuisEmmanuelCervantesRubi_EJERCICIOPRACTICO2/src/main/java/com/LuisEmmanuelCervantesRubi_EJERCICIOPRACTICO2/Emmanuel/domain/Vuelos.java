package com.LuisEmmanuelCervantesRubi_EJERCICIOPRACTICO2.Emmanuel.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import java.util.Date;

@Entity
public class Vuelos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vuelo")  // NOMBRE DE LA VARIABLE EN LA BD
    private Long id_vuelo;
    private String numero_vuelo;
    private String destino;
    private Date fecha_salida;
    private boolean activo;

//ESTABLECE UNA CONEXION CON EL DOMAIN USUARIO POR MEDIO DE SU ID
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Usuario usuario;

    public Vuelos() {
    }

    public Vuelos(Long id_vuelo, String numero_vuelo, String destino, Date fecha_salida, boolean activo, Usuario usuario) {
        this.id_vuelo = id_vuelo;
        this.numero_vuelo = numero_vuelo;
        this.destino = destino;
        this.fecha_salida = fecha_salida;
        this.activo = activo;
        this.usuario = usuario;
    }

    public Long getId() {
        return id_vuelo;
    }

    public void setId(Long id) {
        this.id_vuelo = id;
    }

    public String getNumero_vuelo() {
        return numero_vuelo;
    }

    public void setNumero_vuelo(String numero_vuelo) {
        this.numero_vuelo = numero_vuelo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    
}
