package com.practica.springboot_aplication.Modelo;
import jakarta.persistence.*;

@Entity
@Table(name = "Producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long idProducto;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "precio_unitario")
    private Float precioUnitario;

    @Column(name = "unidades_stock")
    private Integer unidadesStock;

    @Column(name = "unidades_reposicion")
    private Integer unidadesReposicion;

    @Column(name = "flg_discontinuo")
    private Boolean flag;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "id_proovedor")
    private Proovedor proovedor;


}
