package com.practica.springboot_aplication.Modelo;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "Cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Cliente")
    private Long idCliente;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @Column(name = "nombre",nullable = false)
    private String nombre;

    @Column(name = "direccion",nullable = false)
    private String direccion;

    @ManyToOne
    @JoinColumn(name = "id_tipo_cliente")
    private TipoCliente tipoCliente;

    @OneToMany(mappedBy = "Cliente")
    private List<Orden> ordenes;

}
