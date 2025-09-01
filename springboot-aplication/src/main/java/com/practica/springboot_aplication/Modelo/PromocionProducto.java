package com.practica.springboot_aplication.Modelo;
import jakarta.persistence.*;

@Entity
@Table(name = "Promocion_Producto")
public class PromocionProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Promocion_Producto")
    private Long idPromocionProducto;

    @Column(name = "descuento", nullable = false)
    private Float descuento;

    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;

    @ManyToOne
    @JoinColumn(name = "Id_Promocion_Vigencia")
    private PromocionVigencia promociones;

}
