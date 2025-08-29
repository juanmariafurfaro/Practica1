package com.practica.springboot_aplication.Modelo;
import jakarta.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "Orden")
public class Orden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Orden")
    private Long idOrden;

    @ManyToOne
    @JoinColumn(name = "Id_Cliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_empleado")
    private Empleado empleado;

    @Column(name = "fecha_generada")
    private LocalDate fechaGenerada;

    @Column(name = "fecha_entregada")
    private LocalDate fechaEntregada;


}
