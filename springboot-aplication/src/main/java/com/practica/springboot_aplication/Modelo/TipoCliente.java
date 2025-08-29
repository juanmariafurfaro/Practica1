package com.practica.springboot_aplication.Modelo;
import jakarta.persistence.*;
import java.util.List;

public class TipoCliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Tipo_Cliente")
    private Long idTipoCliente;

    @Column(name = "descripcion",nullable = false)
    private String descripcion;

    @OneToMany(mappedBy = "usuario")
    private List<Cliente> clientes;

}
