package com.practica.springboot_aplication.Modelo;
import java.util.List;
import jakarta.persistence.*;

@Entity
@Table(name = "Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Usuario")
    private Long idProducto;

    @Column(name = "Username",nullable = false)
    private String usuario;

    @Column(name = "Contrasenia",nullable = false)
    private String contrasenia;

    @OneToMany(mappedBy = "Usuario")
    private List<Cliente> clientes;

}
