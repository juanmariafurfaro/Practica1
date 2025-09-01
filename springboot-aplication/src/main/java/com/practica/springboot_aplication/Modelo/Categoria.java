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

    public Long getIdCategoria() {
        return idCategoria;
    }


    public void setIdCategoria(Long idCategoria) {
        this.idCategoria = idCategoria;
    }


    public String getDescripcion() {
        return descripcion;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public List<Producto> getProductos() {
        return productos;
    }


 


    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }


    
   public Categoria() {    }
}
