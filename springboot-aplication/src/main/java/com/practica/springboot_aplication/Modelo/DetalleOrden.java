package com.practica.springboot_aplication.Modelo;
import jakarta.persistence.*;
import java.util.List;


@Entity
@Table(name = "Detalle_Orden")
public class DetalleOrden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Detalle_Orden")
    private Long idDetalleOrden;

    @ManyToOne
    @JoinColumn(name = "Id_Orden")
    private Orden orden;

    @ManyToOne
    @JoinColumn(name = "id_Producto")
    private Producto producto;

    @OneToMany(mappedBy = "Orden")
    private List<Orden> ordenes;

}
