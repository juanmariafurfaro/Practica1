package com.practica.springboot_aplication.Modelo;
import jakarta.persistence.*;


@Entity
@Table(name = "Proovedor")
public class Proovedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_proovedor")
    private Long idProovedor;

    @Column(name = "empresa")
    private String empresa;

    @Column(name = "contacto")
    private Long contacto;

    @Column(name = "direccion")
    private String direccion;

}
