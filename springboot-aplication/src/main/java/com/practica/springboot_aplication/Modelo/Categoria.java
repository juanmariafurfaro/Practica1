package com.practica.springboot_aplication.Modelo;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Long idCategoria;

    @Column(name = "descripcion")
    private String descripcion;

    
    @OneToMany(mappedBy = "categoria")
    private List<Producto> productos;

}
