package com.practica.springboot_aplication.Modelo;
import jakarta.persistence.*;

@Entity
@Table(name = "Tipo_Cliente")
public class TipoCliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Tipo_Cliente")
    private Long idTipoCliente;

    @Column(name = "descripcion",nullable = false)
    private String descripcion;

    public Long getIdTipoCliente() {
        return idTipoCliente;
    }

    public void setIdTipoCliente(Long idTipoCliente) {
        this.idTipoCliente = idTipoCliente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
