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
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    public Long getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(Long idOrden) {
        this.idOrden = idOrden;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public LocalDate getFechaGenerada() {
        return fechaGenerada;
    }

    public void setFechaGenerada(LocalDate fechaGenerada) {
        this.fechaGenerada = fechaGenerada;
    }

    public LocalDate getFechaEntregada() {
        return fechaEntregada;
    }

    public void setFechaEntregada(LocalDate fechaEntregada) {
        this.fechaEntregada = fechaEntregada;
    }

    @ManyToOne
    @JoinColumn(name = "id_empleado")
    private Empleado empleado;

    @Column(name = "fecha_generada")
    private LocalDate fechaGenerada;

    @Column(name = "fecha_entregada")
    private LocalDate fechaEntregada;


}
