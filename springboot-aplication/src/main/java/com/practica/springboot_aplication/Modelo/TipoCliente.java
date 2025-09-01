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

}
