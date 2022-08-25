package com.dosideas.videojuegos.domain;

import javax.persistence.*;

@Entity
public class Videojuego {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String nombre;
    @ManyToOne
    private Distribuidor distribuidor;

    public String getImagenUrl() {
        return imagenUrl;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }

    public Distribuidor getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(Distribuidor distribuidor) {
        this.distribuidor = distribuidor;
    }

    private String descripcion;
    private String imagenUrl;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "Id=" + Id +
                ", nombre='" + nombre + '\'' +
                ", distribuidor=" + distribuidor.getId() +
                ", descripcion='" + descripcion + '\'' +
                ", imagenUrl='" + imagenUrl + '\'' +
                '}';
    }
}
