package com.practica.springboot_aplication.Modelo;
import jakarta.persistence.*;


@Entity
@Table(name = "Detalle_Orden")
public class DetalleOrden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Detalle_Orden")
    private Long idDetalleOrden;

    @ManyToOne
    @JoinColumn(name = "id_orden")
    private Orden orden;

    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;

    @Column(name = "cantidad", nullable = false)
    private Integer cantidad;

    public Long getIdDetalleOrden() {
        return idDetalleOrden;
    }

    public void setIdDetalleOrden(Long idDetalleOrden) {
        this.idDetalleOrden = idDetalleOrden;
    }

    public Orden getOrden() {
        return orden;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public DetalleOrden() {}


}
